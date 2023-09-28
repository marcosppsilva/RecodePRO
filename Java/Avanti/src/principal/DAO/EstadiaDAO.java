package principal.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Destino;
import principal.Estadia;

public class EstadiaDAO {
	
	private Connection conexao;	 

    public EstadiaDAO() {
        try {
            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    public void cadastrarEstadia(Estadia estadia) {

        String sql = "INSERT INTO estadia (nome_estadia, tipo, endereco, telefone, email, valor) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

        	stmt.setString(1, estadia.getNome_estadia());
        	
        	stmt.setString(2, estadia.getTipo());
        	
        	stmt.setString(3, estadia.getEndereco());

        	stmt.setString(4, estadia.getTelefone());
        	
        	stmt.setString(5, estadia.getEmail());
            
            stmt.setDouble(6, estadia.getValor());
            
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

	public void excluirEstadia(int id) {

		String sql = "DELETE FROM estadia WHERE id_estadia = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            
            System.out.println("Estadia Excluída com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }
		
	}
	
	public void editarEstadia(Estadia Estadia) {

        String sql = "UPDATE estadia SET nome_estadia = ?, tipo = ?, endereco = ?, telefone = ?, email = ?, valor = ? WHERE id_estadia = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

        	stmt.setString(1, Estadia.getNome_estadia());
        	
        	stmt.setString(2, Estadia.getTipo());
        	
        	stmt.setString(3, Estadia.getEndereco());
        	
        	stmt.setString(4, Estadia.getTelefone());
        	
        	stmt.setString(5, Estadia.getEmail());
        	
        	stmt.setDouble(6, Estadia.getValor());
        	
            stmt.setInt(7, Estadia.getId_estadia());

            stmt.executeUpdate();
            
            System.out.println("Informação Atualizada com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
	
	
	public Estadia verEstadiaId(int id) {
        String sql = "SELECT * FROM estadia WHERE id_estadia = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Estadia estadia = new Estadia();
               
                estadia.setId_estadia(resultado.getInt("id_estadia"));
                estadia.setNome_estadia(resultado.getString("nome_estadia"));
                estadia.setTipo(resultado.getString("tipo"));
                estadia.setEndereco(resultado.getString("endereco"));
                estadia.setTelefone(resultado.getString("telefone"));
                estadia.setEmail(resultado.getString("email")); 
                estadia.setValor(resultado.getDouble("valor"));
                              
                return estadia;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	
	public List<Estadia> listarEstadia() {

        List<Estadia> Estadias = new ArrayList<>();

        String sql = "SELECT * FROM estadia";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Estadia estadia = new Estadia();
                
                estadia.setId_estadia(resultado.getInt("id_estadia"));
                
                estadia.setNome_estadia(resultado.getString("nome_estadia"));
                
                estadia.setTipo(resultado.getString("tipo"));
                
                estadia.setEndereco(resultado.getString("endereco"));
                
                estadia.setTelefone(resultado.getString("telefone"));
                
                estadia.setEmail(resultado.getString("email"));
                                
                estadia.setValor(resultado.getDouble("valor"));
                
                Estadias.add(estadia);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return Estadias;

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
