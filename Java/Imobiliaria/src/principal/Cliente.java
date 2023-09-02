package principal;

public class Cliente {

	private int codigo_cliente;
	private String nome_cliente;
	private String tipo_cliente;
	private String endereco_cliente;
	private String telefone;
	private String email;
	
	
	
	public Cliente() {
		
	}

	public Cliente(int codigo_cliente, String nome_cliente, String tipo_cliente, String endereco_cliente,
			String telefone, String email) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nome_cliente = nome_cliente;
		this.tipo_cliente = tipo_cliente;
		this.endereco_cliente = endereco_cliente;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	
	
	public int getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getTipo_cliente() {
		return tipo_cliente;
	}
	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
	public String getEndereco_cliente() {
		return endereco_cliente;
	}
	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
