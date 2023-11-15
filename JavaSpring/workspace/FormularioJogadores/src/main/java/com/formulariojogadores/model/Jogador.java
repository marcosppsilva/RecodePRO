package com.formulariojogadores.model;

public class Jogador {

	private int numeroJogador;
	private String nome;
	
	public Jogador() {
		super();
	}
	
	public Jogador(int numeroJogador, String nome) {
		super();
		this.numeroJogador = numeroJogador;
		this.nome = nome;
	}

	public int getNumeroJogador() {
		return numeroJogador;
	}

	public void setNumeroJogador(int numeroJogador) {
		this.numeroJogador = numeroJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
