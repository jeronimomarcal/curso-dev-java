package com.heranca;

public abstract class Pessoa {
	
	//atributos
	public int idPessoa;
	public String telefone;
	public String endereco;

	//construtor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		
		this.idPessoa = idPessoa;
		
	}

	//metodos
	public String cumprimentar() {
		return "Boa tarde!";
	}
	
	public String apresentar () {
		return ". Meu endereço é " + this.endereco + ".";
	}
	
}
