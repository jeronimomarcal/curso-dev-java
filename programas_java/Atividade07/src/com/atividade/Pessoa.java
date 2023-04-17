package com.atividade;

public class Pessoa {
	
	//atributos
	private int idPessoa;
	private String nome;
	private String cpf;
	private String email;
	
	//associação
	private Telefone tel;
	private Endereco end;
	
	//contrutor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		this.idPessoa = idPessoa;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

}
