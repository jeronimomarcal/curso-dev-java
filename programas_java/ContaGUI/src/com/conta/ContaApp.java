package com.conta;

import javax.swing.JOptionPane;

public class ContaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia o objeto da classe conta
		Conta cc = new Conta("1001-1", "10101-1", 0);
		
		//declaração de variaveis
		String valorStr;
		double valorDbl;
		
		
		//vetor
		Object opcoes[] = {"Consultar dados", "Consultar saldo", "Depositar valor", "Sacar valor", "Sair"};
		Object opcao;
		
		//informa o nome do titular
		cc.setNomeTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
		
		//loop
		do {
			//mostra as opções
			opcao = JOptionPane.showInputDialog(null, "Opções", "Escolha a operação desejada:", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			//verifica a opção escolhida
			if (opcao == "Consultar dados")
				JOptionPane.showMessageDialog(null, cc.consultarDados());
			else if (opcao == "Consultar saldo")
				JOptionPane.showMessageDialog(null, cc.consultarSaldo());
			else if (opcao == "Depositar valor") {
				//informa o valor do depósito
				valorStr = JOptionPane.showInputDialog("Informe o valor a ser depositado");
			
				
				//converte valor para double, repassa para o método e exibe na tela
				JOptionPane.showConfirmDialog(null, "Depósito efetuado com sucesso. \nSaldo atual: R$ " + cc.depositarValor(Double.parseDouble(valorStr.replace(",", "."))));
				
			}
			else if (opcao == "Sacar valor") {
				
				//informa o valor do saque
				valorStr = JOptionPane.showInputDialog("Informe o valor do saque:");
				
				valorDbl = Double.parseDouble(valorStr); 
					if (cc.getSaldo() >= valorDbl)
						JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso. \nSaldo atual: R$ " + cc.sacarValor(valorDbl) + ".");
					else
						JOptionPane.showMessageDialog(null, "Não foi possivel efetuar o saque. \nSaldo atual: R$ " + cc.sacarValor(valorDbl) + ".");
			}
			else
				JOptionPane.showMessageDialog(null, "Obrigado.");
			
		} while (opcao != "Sair");
	}

}
