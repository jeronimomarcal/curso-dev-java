package com.atividade;

public final class Endereco {
	//atributos
	private int codEnd;
	private String cep;
	private String ud;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String complemento;
	private String numero;
	
	//contrutor
	public Endereco(int codEnd) {
		// TODO Auto-generated constructor stub
		this.codEnd = codEnd;
	}

	public int getCodEnd() {
		return codEnd;
	}

	public void setCodEnd(int codEnd) {
		this.codEnd = codEnd;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUd() {
		return ud;
	}

	public void setUd(String ud) {
		this.ud = ud;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
