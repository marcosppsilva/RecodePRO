package principal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import principal.Conexao;
import principal.Usuario;

public class UsuarioDAO {
	
	private Connection conexao;	 

    public UsuarioDAO() {
        try {

            conexao = Conexao.conectar();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuario (cpf, idade, email, nome, telefone, endereco, senha, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, usuario.getCpf());

            stmt.setInt(2, usuario.getIdade());
            
            stmt.setString(3, usuario.getEmail());
            
            stmt.setString(4, usuario.getNome());
            
            stmt.setString(5, usuario.getTelefone());
            
            stmt.setString(6, usuario.getEndereco());
            
            stmt.setString(7, usuario.getSenha());
            
            stmt.setString(8, usuario.getTipo());

            stmt.executeUpdate();
            
            System.out.println("Informação Inserida com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void excluirUsuario(int id) {

        String sql = "DELETE FROM usuario WHERE id_usuario = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            
            System.out.println("Usuário Excluído com Sucesso");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public List<Usuario> listarUsuario() {

        List<Usuario> Usuarios = new ArrayList<>();

        String sql = "SELECT * FROM usuario where tipo = 'cliente'";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                Usuario usuario = new Usuario();
                
                usuario.setId_usuario(resultado.getInt("id_usuario"));
                
                usuario.setNome(resultado.getString("nome"));
                
                usuario.setCpf(resultado.getString("cpf"));
                
                usuario.setIdade(resultado.getInt("idade"));
                
                usuario.setTelefone(resultado.getString("telefone"));
                
                usuario.setEmail(resultado.getString("email"));
                
                usuario.setEndereco(resultado.getString("endereco"));
                
                Usuarios.add(usuario);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return Usuarios;

    }
    
    public Usuario verUsuarioId(int id) {
        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Usuario usuario = new Usuario();
               
                usuario.setId_usuario(resultado.getInt("id_usuario"));                
                usuario.setNome(resultado.getString("nome"));                
                usuario.setCpf(resultado.getString("cpf"));                
                usuario.setIdade(resultado.getInt("idade"));                
                usuario.setTelefone(resultado.getString("telefone"));                
                usuario.setEmail(resultado.getString("email"));                
                usuario.setEndereco(resultado.getString("endereco"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipo(resultado.getString("tipo"));
                
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void editarUsuario(Usuario Usuario) {

        String sql = "UPDATE usuario SET cpf = ?, idade = ?, email = ?, nome = ?, telefone = ?, endereco = ?, senha = ?, tipo = ? WHERE id_usuario = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, Usuario.getCpf());

            stmt.setInt(2, Usuario.getIdade());

            stmt.setString(3, Usuario.getEmail());
            
            stmt.setString(4, Usuario.getNome());
            
            stmt.setString(5, Usuario.getTelefone());
            
            stmt.setString(6, Usuario.getEndereco());
            
            stmt.setString(7, Usuario.getSenha());
            
            stmt.setString(8, Usuario.getTipo());
            
            stmt.setInt(9, Usuario.getId_usuario());

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
