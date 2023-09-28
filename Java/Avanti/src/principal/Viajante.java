package principal;

public class Viajante {
	private int id_viajante;
	private String nome_viajante;
	private int idade_viajante;
	private String cpf_viajante;
	
	
	
	public Viajante() {
		
	}


	public Viajante(int id_viajante, String nome_viajante, String cpf_viajante, int idade_viajante) {
		super();
		this.id_viajante = id_viajante;
		this.nome_viajante = nome_viajante;
		this.cpf_viajante = cpf_viajante;
		this.idade_viajante = idade_viajante;
	}


	public int getId_viajante() {
		return id_viajante;
	}


	public void setId_viajante(int id_viajante) {
		this.id_viajante = id_viajante;
	}


	public String getNome_viajante() {
		return nome_viajante;
	}


	public void setNome_viajante(String nome_viajante) {
		this.nome_viajante = nome_viajante;
	}


	public String getCpf_viajante() {
		return cpf_viajante;
	}


	public void setCpf_viajante(String cpf_viajante) {
		this.cpf_viajante = cpf_viajante;
	}


	public int getIdade_viajante() {
		return idade_viajante;
	}


	public void setIdade_viajante(int idade_viajante) {
		this.idade_viajante = idade_viajante;
	}
	
	
	

}
