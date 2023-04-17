package com.contausuario;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//intancia os objetos
		Random num = new Random();
		Pessoa usuario = new Pessoa(num.nextInt(100000));
		Conta cc = new Conta(num.nextInt(1000), num.nextInt(10000), 0);
		
		//vetor
		Object opcoes[] = {"Consultar dados", "Consultar saldo", "Depositar valor", "Sacar valor", "Sair"};
		Object opcao;
		
		//entrada de dados do usuario
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta: "));
		usuario.setRg(JOptionPane.showInputDialog("Informe o RG do titular da conta: "));
		usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta: "));
		usuario.setEmail(JOptionPane.showInputDialog("Informe o E-mail do titular da conta: "));
		
		//repassar os valors do usuario para o objeto conta
		cc.setTitularConta(usuario);
		
		//loop
		do {
			//mostra opções para o usuario
			opcao = JOptionPane.showInputDialog(null, "Opções", "Escolha a operação desejada:", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			//verifica a opção escolhida
			if (opcao == "Consultar dados")
				JOptionPane.showMessageDialog(null, "DADOS DA CONTA:\n\nAgência: " + cc.getNumAg() + ".\nConta: " + cc.getNumConta() + ".\nID do titular: " + cc.getTitularConta().getIdPessoa() + ".\nNome do titular: " + cc.getTitularConta().getNome() + ".\nCPF do titular: " + cc.getTitularConta().getCpf() + ".\nRG do titular: " + cc.getTitularConta().getRg() + ".\nE-mail do titular: " + cc.getTitularConta().getEmail() + ".");
			
			else if (opcao == "Consultar saldo")
				JOptionPane.showMessageDialog(null, "Saldo: R$ " + String.format("%.2f", cc.getSaldo() + "."));
		} while (opcao != "Sair");
		
	}

}
