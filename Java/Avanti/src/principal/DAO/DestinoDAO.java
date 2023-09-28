package principal.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Destino;



public class DestinoDAO {
	private Connection conexao;	 

    public DestinoDAO() {
        try {

            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    public void cadastrarDestino(Destino destino) {

        String sql = "INSERT INTO destino (pais, provincia_estado, cidade, valor) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, destino.getPais());

            stmt.setString(2, destino.getProvincia_estado());
            
            stmt.setString(3, destino.getCidade());
            
            stmt.setDouble(4, destino.getValor());
            
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void excluirDestino(int id) {

        String sql = "DELETE FROM destino WHERE id_destino = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            
            System.out.println("Destino Excluído com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    
    public List<Destino> listarDestino() {

        List<Destino> Destinos = new ArrayList<>();

        String sql = "SELECT * FROM destino";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Destino destino = new Destino();
                
                destino.setId_destino(resultado.getInt("id_destino"));
                
                destino.setPais(resultado.getString("pais"));
                
                destino.setProvincia_estado(resultado.getString("provincia_estado"));
                
                destino.setCidade(resultado.getString("cidade"));
                
                destino.setValor(resultado.getDouble("valor"));
                
                Destinos.add(destino);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return Destinos;

    }
    
    public Destino verDestinoId(int id) {
        String sql = "SELECT * FROM destino WHERE id_destino = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Destino destino = new Destino();
               
                destino.setId_destino(resultado.getInt("id_destino"));
                destino.setPais(resultado.getString("pais"));
                destino.setProvincia_estado(resultado.getString("provincia_estado"));
                destino.setCidade(resultado.getString("cidade"));
                destino.setValor(resultado.getDouble("valor"));
                              
                return destino;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void editarDestino(Destino Destino) {

        String sql = "UPDATE destino SET pais = ?, provincia_estado = ?, cidade = ?, valor = ? WHERE id_destino = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

        	stmt.setString(1, Destino.getPais());
        	
        	stmt.setString(2, Destino.getProvincia_estado());
        	
        	stmt.setString(3, Destino.getCidade());

        	stmt.setDouble(4, Destino.getValor());
        	
            stmt.setInt(5, Destino.getId_destino());

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
