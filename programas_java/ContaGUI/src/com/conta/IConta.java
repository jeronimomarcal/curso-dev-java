package com.conta;

public interface IConta {
	//métodos
	public String consultarDados();
	public double consultarSaldo();
	public double depositarValor(double valor);
	public double sacarValor(double valor);

}