package com.conta;

public class Conta implements IConta {
	//atributos
	private String numAg;
	private String numConta;
	private String nomeTitular;
	private double saldo;
	

	public Conta(String numAg, String numConta) {
		// TODO Auto-generated constructor stub
		this.numAg = numAg;
		this.numConta = numConta;
	} 
	public Conta(String numAg, String numConta, double saldo) {
		// TODO Auto-generated constructor stub
		this.numAg = numAg;
		this.numConta = numConta;
		this.saldo = saldo;
	} 

	@Override
	public String consultarDados() {
		// TODO Auto-generated method stub
		return "Titular da conta: " + this.nomeTitular + ".\nAgência: " + this.numAg + ".\nConta: " + this.numConta + ".";
	}

	@Override
	public double consultarSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
		
	}

	@Override
	public double depositarValor(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		return this.saldo;
	}

	@Override
	public double sacarValor(double valor) {
		// TODO Auto-generated method stub
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return this.saldo;
		}
		else 
			return this.saldo;
		
	}
	
	//metodos de acesso
	
	public String getNumAg() {
		return numAg;
	}
	public void setNumAg(String numAg) {
		this.numAg = numAg;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
