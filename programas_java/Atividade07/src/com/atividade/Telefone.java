package com.atividade;

public class Telefone {
	//atributos
	private int codTel;
	private String telContato;
	private String telCelular;
	
	//construtor
	public Telefone(int codTel) {
		// TODO Auto-generated constructor stub
		this.codTel = codTel;
	}

	//metodos de acesso
	public int getCodTel() {
		return codTel;
	}

	public void setCodTel(int codTel) {
		this.codTel = codTel;
	}

	public String getTelContato() {
		return telContato;
	}

	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

}
