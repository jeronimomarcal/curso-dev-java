package com.maioridade;

// importa a calsse de entrada de dados
import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração de variaveis
		String nome;
		int idade;
		
		 //intancia do objeto Scanner
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Informe o nome: ");
		nome = leia.nextLine();
		System.out.println("Informe a idade: ");
		idade = leia.nextInt();
		
		//estrutura de decisao "equivalente ao se..senao"
		if (idade >= 18) {
			System.out.println(nome + " é maior de idade.");
		}
		else {
			System.out.println(nome + " é menor de idade.");
		}
	}

}
