package com.calculadora;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instacia de objetos
		Calculadora calc = new Calculadora();
		JOptionPane cx = new JOptionPane();
		
		//declaração de variaveis
		int opcao;
		
		//entrada de dados
		do {
			calc.operador = cx.showInputDialog("Informe a opção desejada:\n1 - Somar.\n2 - Subtrair.\n3 - Multiplicar.\n4 - Dividir.\n5 - Sair");
			
			opcao = Integer.parseInt(calc.operador);
			
			if (opcao > 0 && opcao < 5) {
				calc.x = cx.showInputDialog("Informe o 1° número:");
				calc.y = cx.showInputDialog("Informe o 2° número:");
				
				if (opcao == 1)
					cx.showMessageDialog(null, "A soma é: " + calc.somar(Double.parseDouble(calc.x), Double.parseDouble(calc.y)) + ".");
				
				else if (opcao == 2)
					cx.showMessageDialog(null, "A subtração é: " + calc.subtrair(Double.parseDouble(calc.x), Double.parseDouble(calc.y)) + ".");
				
				else if (opcao == 3)
					cx.showMessageDialog(null, "A multiplicação é: " + calc.multiplicar(Double.parseDouble(calc.x), Double.parseDouble(calc.y)) + ".");
				
				else
				cx.showMessageDialog(null, "A divisão é: " + calc.dividir(Double.parseDouble(calc.x), Double.parseDouble(calc.y)) + ".");
			
			}
			
			else if (opcao == 5)
				cx.showMessageDialog(null, "Obrigado!");
			else
				cx.showMessageDialog(null, "Opção inválida.");
			
		} while (opcao != 5);
	}

}
