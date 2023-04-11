package com.desafio;

import javax.swing.JOptionPane;

public class DesafioApp {

	public static void main(String[] args) {
		//instancia o objeto funcionario
		Funcionario empregado = new Funcionario();

		
		//vetores
		Object opcoes[] = {"Cadastrar funcionario", "Sair"};
		Object opcao;
		
		//loop
		do {
			
			//escolha das opções
			opcao = JOptionPane.showInputDialog(null,"Opções", "Escolha a opção:", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			//verifica a opção selecionada
			if (opcao == "Cadastrar funcionario") {
				//dados funcionario
				empregado.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
				empregado.setDatanasc(JOptionPane.showInputDialog("Informe a data de nascimento:"));
				empregado.setEndereco(JOptionPane.showInputDialog("Informe o enderenço:"));
				empregado.setCargo(JOptionPane.showInputDialog("Informe o Cargo:"));
				empregado.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário em reais:").replace(",", ".")));				
				//saida de dados do funcionario
				JOptionPane.showInputDialog(null, "DADOS DO FUNCIONÁRIO:\n\nNome:" + empregado.getNome() + ".\nCargo:" + empregado.getCargo() + ".\nSalário: R$ " + String.format("%.2f", empregado.getSalario()) + ".");
				
			}
			else
				JOptionPane.showConfirmDialog(null, "Obrigado.");
		
			
		} while (opcao != "Sair");
	}

}
