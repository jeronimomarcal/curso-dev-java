package com.soma;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declração de variavel
		int soma;
		int n1 = 0;
		int n2 = 0; 
		
		//entrada de dados
		 n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 1° numero:"));
		 n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 2° numero:"));
		
		 //algoritimo
		soma = n1 + n2;
		
		//saida de dados
		JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma + ".");
			
		
	}

}
