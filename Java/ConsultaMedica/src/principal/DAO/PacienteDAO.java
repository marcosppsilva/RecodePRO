package principal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Medico;
import principal.Paciente;

public class PacienteDAO {
	
	private Connection conexao;
	
	public PacienteDAO() {
		try {
			conexao = Conexao.conectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void criarPaciente(Paciente paciente) {
		
		String sql = "INSERT INTO Pacientes (nome, idade) VALUES (?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, paciente.getNome());

            stmt.setInt(2, paciente.getIdade());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
		
	}

	public List<Paciente> listarPacientes() {

        List<Paciente> Pacientes = new ArrayList<>();

        String sql = "SELECT * FROM Pacientes";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Paciente Paciente = new Paciente();

                Paciente.setId(resultado.getInt("id"));

                Paciente.setNome(resultado.getString("nome"));

                Paciente.setIdade(resultado.getInt("idade"));

                Pacientes.add(Paciente);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return Pacientes;

    }

	public Paciente buscarPacientePorId(int id) {
        String sql = "SELECT * FROM Pacientes WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setIdade(rs.getInt("idade"));
                return paciente;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se o paciente não for encontrado
    }
	
	public void excluirPaciente(int id) {

        String sql = "DELETE FROM Pacientes WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            
            System.out.println("Paciente Excluído com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
	
	public void atualizarPaciente(Paciente paciente) {

        String sql = "UPDATE Pacientes SET nome = ?, idade = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, paciente.getNome());

            stmt.setInt(2, paciente.getIdade());

            stmt.setInt(3, paciente.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

	public void fecharConexao() {

        try {

            if (conexao != null && !conexao.isClosed()) {

                conexao.close();

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
	
}
