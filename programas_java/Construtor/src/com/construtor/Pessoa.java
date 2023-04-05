package com.construtor;

public class Pessoa {

	//atributos
	public int idPessoa;
	public int idade;
	public String nome;
	public String profissao;
	public String genero;
	
	public Pessoa(int idPessoa, String genero) {
		// TODO Auto-generated constructor stub
		
		//repassa os valores dos parâmetros para os atributos
		this.idPessoa = idPessoa;
		this.genero = genero;
		
		
	}

}
