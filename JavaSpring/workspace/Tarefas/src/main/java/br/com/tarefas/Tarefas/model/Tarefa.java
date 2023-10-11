package br.com.tarefas.Tarefas.model;

public class Tarefa {
	
	
	//Atributos
	private int id;
	private String descricao;
	
	
	//Construtores
	public Tarefa() {
		super();
	}
		
	public Tarefa(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	

	//Metodos Acessores
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
