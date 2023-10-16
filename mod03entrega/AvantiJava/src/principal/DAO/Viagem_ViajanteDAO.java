package principal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Viagem_Viajante;

public class Viagem_ViajanteDAO {

	private Connection conexao;
	ViagemDAO viagemdao = new ViagemDAO();
	UsuarioDAO usuariodao = new UsuarioDAO();
	
    public Viagem_ViajanteDAO() {
        try {
            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
	
    public void criarViagemViajante(Viagem_Viajante viagem_viajante) {
        String sql = "INSERT INTO viagemviajante (id_viagem, id_usuario) VALUES (?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

        	stmt.setInt(1, viagem_viajante.getViagem().getId_viagem());
        	stmt.setInt(2, viagem_viajante.getUsuario().getId_usuario());
        	
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluirViagemViajante(int id) {
        String sql = "DELETE FROM viagem_viajante WHERE id_viagem_viajante = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<Viagem_Viajante> listarViagemViajantes() {
        List<Viagem_Viajante> viagemViajantes = new ArrayList<>();
        String sql = "SELECT * FROM viagem_viajante";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Viagem_Viajante viagemViajante = new Viagem_Viajante();
                
                viagemViajante.setId_viagem_viajante(resultado.getInt("id_viagem_viajante"));
                viagemViajante.setViagem(viagemdao.buscarViagemId(resultado.getInt("id_viagem")));
                viagemViajante.setUsuario(usuariodao.verUsuarioId(resultado.getInt("id_usuario")));
                                             
            	viagemViajantes.add(viagemViajante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return viagemViajantes;
    }
          
    public Viagem_Viajante buscarViagemViajanteId(int id) {
        Viagem_Viajante viagemViajante = null;
        String sql = "SELECT * FROM viagem_viajante WHERE id_viagem_viajante = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
            	viagemViajante = new Viagem_Viajante();
            	
            	viagemViajante.setId_viagem_viajante(resultado.getInt("id_viagem_viajante"));
            	viagemViajante.setViagem(viagemdao.buscarViagemId(resultado.getInt("id_viagem")));
            	viagemViajante.setUsuario(usuariodao.verUsuarioId(resultado.getInt("id_usuario")));
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return viagemViajante;
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
