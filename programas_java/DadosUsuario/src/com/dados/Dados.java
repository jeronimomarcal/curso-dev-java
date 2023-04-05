package com.dados;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instancia do objeto Scanner
		Scanner leia = new Scanner(System.in);
		
		// declaração de variaveis
		String nome;
		String email;
		String profissao;
		int idade;
		
		// entrada de dados
		System.out.println("Informe o nome:");
		nome = leia.nextLine();
		System.out.println("Informe a idade:");
		idade = leia.nextInt();
		
		// limpeza de buffer
		leia.nextLine();
		
		System.out.println("Informe o E-mail:");
		email = leia.nextLine();
		System.out.println("Imforme a profissão");
		profissao = leia.nextLine();
		
		// saida de dados
		System.out.println("Nome: " + nome + ".");
		System.out.println("Idade: " + idade + ".");
		System.out.println("E-mail: " + email + ".");
		System.out.println("Profissão: " + profissao + ".");
	}

}
