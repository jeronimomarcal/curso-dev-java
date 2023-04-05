package com.imc;

import javax.swing.JOptionPane;

public class IMCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instância objeto
		Pessoa usuario = new Pessoa();
		
		//declaração de variveis
		String pesoStr, alturaStr;
		
		//declaração de vetor
		Object opcoes[] = {"Calcular IMC", "Sair"};	
		Object opcao;
		
		//loop
		do {
			//mostrar as opções
			opcao = JOptionPane.showInputDialog(null, "Opções", "Escolha a opção desejada:", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			//verifica a opção desejada
			if (opcao == "Calcular IMC") {
				//entrada de dados
				usuario.nome = JOptionPane.showInputDialog("Informe o nome:");
				pesoStr = JOptionPane.showInputDialog("Informe o peso:");
				alturaStr = JOptionPane.showInputDialog("Informe a altura:");
				
				//trocando ponto por vírgula
				pesoStr = pesoStr.replace(",", ".");
				alturaStr = alturaStr.replace(",", ".");
				
				//conversao de string para double e repassa para os atributos
				usuario.peso = Double.parseDouble(pesoStr);
				usuario.altura = Double.parseDouble(alturaStr);
				
				//saida de dados
				JOptionPane.showMessageDialog(null, "O IMC do " + usuario.nome + " é: \n" + String.format("%.3f",usuario.calcularIMC()) + ".\n" + usuario.verificarPeso());
			}
			else
				JOptionPane.showMessageDialog(null, "Obrigado.");
		} while (opcao != "Sair");
		
		
	}

}
