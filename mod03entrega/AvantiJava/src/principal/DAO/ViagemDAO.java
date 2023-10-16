package principal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Viagem;
import principal.Viagem_Viajante;

public class ViagemDAO {
	private Connection conexao;
	UsuarioDAO usuariodao = new UsuarioDAO();
	DestinoDAO destinodao = new DestinoDAO();
	EstadiaDAO estadiadao = new EstadiaDAO();

    public ViagemDAO() {
        try {
            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    
    public long criarViagem(Viagem viagem) {
        String sql = "INSERT INTO viagem (data, tipo, duracao, viajantes, valor_viagem, id_usuario, id_destino, id_estadia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        	        	
        	stmt.setTimestamp(1, new java.sql.Timestamp(viagem.getData().getTime()));
        	stmt.setString(2, viagem.getTipo());
        	stmt.setInt(3, viagem.getDuracao());
        	stmt.setInt(4, viagem.getViajantes());
        	stmt.setDouble(5, viagem.getValor_viagem());
        	stmt.setInt(6, viagem.getUsuario().getId_usuario());
        	stmt.setInt(7, viagem.getDestino().getId_destino());
        	
        	if(viagem.getEstadia() != null) {
        		
        		stmt.setInt(8, viagem.getEstadia().getId_estadia()); 
        	} else {
        		
        		stmt.setNull(8, java.sql.Types.INTEGER);
        	}
        	
            stmt.executeUpdate();
            
            ResultSet pegaid = stmt.getGeneratedKeys();
            if(pegaid.next()){
            	return (pegaid.getLong(1));
            }
                                  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    public void excluirViagem(int id) {
        String sql = "DELETE FROM viagem WHERE id_viagem = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Viagem> listarViagens() {
        List<Viagem> viagens = new ArrayList<>();
        String sql = "SELECT * FROM viagem";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Viagem viagem = new Viagem();
                
                viagem.setId_viagem(resultado.getInt("id_viagem"));
            	viagem.setData(resultado.getTimestamp("data"));
            	viagem.setTipo(resultado.getString("tipo"));
            	viagem.setDuracao(resultado.getInt("duracao"));
            	viagem.setValor_viagem(resultado.getDouble("valor_viagem"));
            	viagem.setUsuario(usuariodao.verUsuarioId(resultado.getInt("id_usuario")));
            	viagem.setDestino(destinodao.verDestinoId(resultado.getInt("id_destino")));
            	viagem.setEstadia(estadiadao.verEstadiaId(resultado.getInt("id_estadia")));
                
                viagens.add(viagem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return viagens;
    }
    
    public Viagem buscarViagemId(int id) {
        Viagem viagem = null;
        String sql = "SELECT * FROM viagem WHERE id_viagem = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
            	viagem = new Viagem();
                
            	viagem.setId_viagem(resultado.getInt("id_viagem"));
            	viagem.setData(resultado.getTimestamp("data"));
            	viagem.setTipo(resultado.getString("tipo"));
            	viagem.setDuracao(resultado.getInt("duracao"));
            	viagem.setValor_viagem(resultado.getDouble("valor_viagem"));
            	viagem.setUsuario(usuariodao.verUsuarioId(resultado.getInt("id_usuario")));
            	viagem.setDestino(destinodao.verDestinoId(resultado.getInt("id_destino")));
            	viagem.setEstadia(estadiadao.verEstadiaId(resultado.getInt("id_estadia")));
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return viagem;
    }
    
    public void editarViagem(Viagem viagem) {
        String sql = "UPDATE viagem SET data = ? WHERE id_viagem = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
        	stmt.setTimestamp(1, new java.sql.Timestamp(viagem.getData().getTime()));
        	stmt.setInt(2, viagem.getId_viagem());
        	
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void editarValorViagem(Viagem viagem) {
        String sql = "UPDATE viagem SET valor_viagem = ?, viajantes = ? WHERE id_viagem = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
        	stmt.setDouble(1, viagem.getValor_viagem());
        	stmt.setInt(2, viagem.getViajantes());
        	stmt.setInt(3, viagem.getId_viagem());
        	
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
