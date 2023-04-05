package com.brinquedo;


import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 	
					//intancia do objeto Scanner
					Scanner leia = new Scanner(System.in);
					
					//declaração de variaveis
					String nome;
					double altura;
					
					//entrada de dados
					System.out.println("Informe o nome: ");
					nome = leia.nextLine();
					System.out.println("Informe a sua altura: ");
					altura = leia.nextDouble();
					
					//verifica a altura
					if (altura >= 1.2)
						System.out.println(nome + " Usuário liberado");
					else
						System.out.println(nome + " Usuário não permitido");
				
			}

	}
