package principal;

public class Medico {
	private String crm;
	private String nome;
	private String endereco;
	
	
	public Medico(String crm, String nome, String endereco) {
		this.crm = crm;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Medico() {
		
	}
	
	
	
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
