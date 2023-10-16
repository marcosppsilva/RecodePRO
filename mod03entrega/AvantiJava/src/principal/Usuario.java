package principal;

public class Usuario {
	
	private int id_usuario;
	private String cpf;
	private int idade;
	private String email;
	private String nome;
	private String telefone;
	private String endereco;
	private String senha;
	private String tipo;
	
	public Usuario() {
	
	}

	public Usuario(int id_usuario, String cpf, int idade, String email, String nome, String telefone, String endereco,
			String senha, String tipo) {
		super();
		this.id_usuario = id_usuario;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.senha = senha;
		this.tipo = tipo;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
