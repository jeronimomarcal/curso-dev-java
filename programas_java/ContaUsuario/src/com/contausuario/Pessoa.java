package com.contausuario;

public class Pessoa {
	
	//atributos
	private int idPessoa;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	
	//construtor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		this.idPessoa = idPessoa;
	}

		//metodos de acesso
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
