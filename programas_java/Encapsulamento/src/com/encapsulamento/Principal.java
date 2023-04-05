package com.encapsulamento;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instancia o objeto
		Pessoa usuario = new Pessoa();
		
		//repassando os valores para os atributos do objeto
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
		usuario.setEmail(JOptionPane.showInputDialog("Informe o e-mail:"));
		usuario.setProfissao(JOptionPane.showInputDialog("Informe a profissão:"));
		usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
		
		//saida de dados
		JOptionPane.showMessageDialog(null, "Nome: " + usuario.getNome() + ".\nE-mail: " + usuario.getEmail() + ".\nProfissão: " + usuario.getProfissao()  + ".\nCPF: " + usuario.getCpf() + ".\nIdade: " + usuario.getIdade() + ".");
	
	}

}
