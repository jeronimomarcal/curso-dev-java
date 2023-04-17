package com.contausuario;

public class Conta implements IConta {

	//atributos
	private int numAg;
	private int numConta;
	private double saldo;
		//associação entre classes
		private Pessoa titularConta;
	
	//construtores
	public Conta(int numAg, int numConta) {
		// TODO Auto-generated constructor stub
		
		this.numAg = numAg;
		this.numConta = numConta;
	}
	
	public Conta(int numAg, int numConta, double saldo) {
		// TODO Auto-generated constructor stub
		
		this.numAg = numAg;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//metodos da interface
	@Override
	public double depositarValor(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sacarValor(double Valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	//metodos de acesso
	public int getNumAg() {
		return numAg;
	}

	public void setNumAg(int numAg) {
		this.numAg = numAg;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Pessoa titularConta) {
		this.titularConta = titularConta;
	}

}
