package principal;

public class Usuario {

	private int codigoUsuario;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private String telefone;
	private String nivelAcesso;
	
	
	
	public Usuario(int codigoUsuario, String nome, String email, String login, String senha, String telefone,
			String nivelAcesso) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.telefone = telefone;
		this.nivelAcesso = nivelAcesso;
	}



	public Usuario() {
		
	}



	public int getCodigoUsuario() {
		return codigoUsuario;
	}



	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getNivelAcesso() {
		return nivelAcesso;
	}



	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
}
