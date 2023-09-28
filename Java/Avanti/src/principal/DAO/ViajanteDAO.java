package principal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Viajante;

public class ViajanteDAO {

	private Connection conexao;	 

    public ViajanteDAO() {
        try {

            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    public void cadastrarViajante(Viajante viajante) {

        String sql = "INSERT INTO viajante (nome_viajante, idade_viajante, cpf_viajante) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

        	stmt.setString(1, viajante.getNome_viajante());
        	
        	stmt.setInt(2, viajante.getIdade_viajante());
        	
        	stmt.setString(3, viajante.getCpf_viajante());
        	
            stmt.executeUpdate();
            
            System.out.println("Informação Inserida com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    
    public List<Viajante> listarViajante() {

        List<Viajante> Viajantes = new ArrayList<>();

        String sql = "SELECT * FROM viajante";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Viajante viajante = new Viajante();
                
                viajante.setId_viajante(resultado.getInt("id_viajante"));
                
                viajante.setNome_viajante(resultado.getString("nome_viajante"));
                
                viajante.setCpf_viajante(resultado.getString("cpf_viajante"));
                
                viajante.setIdade_viajante(resultado.getInt("idade_viajante"));
                
                               
                Viajantes.add(viajante);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return Viajantes;

    }
    
    public Viajante verViajanteId(int id) {
        String sql = "SELECT * FROM viajante WHERE id_viajante = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Viajante viajante = new Viajante();
               
                viajante.setId_viajante(resultado.getInt("id_viajante"));
                
                viajante.setNome_viajante(resultado.getString("nome_viajante"));
                
                viajante.setCpf_viajante(resultado.getString("cpf_viajante"));
                
                viajante.setIdade_viajante(resultado.getInt("idade_viajante"));
                       
                return viajante;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void editarViajante(Viajante Viajante) {

        String sql = "UPDATE viajante SET nome_viajante = ?, cpf_viajante = ?, idade_viajante = ? WHERE id_viajante = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, Viajante.getNome_viajante());
            
            stmt.setString(2, Viajante.getCpf_viajante());
            
            stmt.setInt(3, Viajante.getIdade_viajante());
                      
            stmt.setInt(4, Viajante.getId_viajante());

            stmt.executeUpdate();
            
            System.out.println("Informação Atualizada com Sucesso");

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
