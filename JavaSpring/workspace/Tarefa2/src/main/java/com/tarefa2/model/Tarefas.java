package com.tarefa2.model;

public class Tarefas {
	
	//Atributos
	private int id;
	private String descricao;	
	
	//Construtores
	public Tarefas() {
		super();
	}	
	
	public Tarefas(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	//Metodos acessores
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
