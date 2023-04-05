package com.calculadora;

public class Calculadora {
	//atributos
	public String x;
	public String y;
	public String operador;
	
	//métodos
	public double somar(double x, double y) {
		return x + y;
	}
	
	public double subtrair(double x, double y) {
		return x - y;
	}
	
	public double multiplicar(double x, double y) {
		return x * y;
	}
	
	public double dividir(double x, double y) {
		return x / y;
	}
}
