package principal;

import java.util.Date;

public class Paciente {

	private int id;
	private String nome;
	private String endereco;
	private String sexo;
	private Date date;
	
	public Paciente(int id, String nome, String endereco, String sexo, Date date) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.date = date;
	}
	
	public Paciente() {
	}
	
	

	public void setId(int value) {
		id = value;
	}
	
	public int getId() {
		return id;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
