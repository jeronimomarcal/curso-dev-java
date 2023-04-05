package com.imc;

public class Pessoa {
	//atributos
	public String nome;
	public double peso;
	public double altura;
	public double imc;
	
	//métodos
	public double calcularIMC() {
		//calcula o imc
		this.imc = this.peso/(this.altura * this.altura);
		
		//retorna o imc
		return this.imc;
		
	}
	
	public String verificarPeso() {
		//verifica o valor do imc e retorna o diagnostico
		if (this.imc < 18.5)
			return this.nome + " está abaixo do peso.";
		else if (this.imc < 25)
			return this.nome + " está no peso ideal.";
		else if (this.imc < 30)
			return this.nome + " está acima do peso.";
		else if (this.imc < 35)
			return this.nome + " está com obesidade I";
		else if (this.imc < 40)
			return this.nome + " está com obesidade II";
		else 
			return this.nome + " está com obesidade mórbida.";

	
	}
}
