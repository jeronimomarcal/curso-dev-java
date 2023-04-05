package com.construtor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instacia o objeto da classe pessoa
		Pessoa usuario = new Pessoa(1, "Masculino");
		
		//entrada de dados
		usuario.nome = JOptionPane.showInputDialog("Informe o nome:");
		usuario.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));
		usuario.profissao = JOptionPane.showInputDialog("Informe a profissão");
		
		//saída de dados
		JOptionPane.showMessageDialog(null, "ID: " + usuario.idPessoa + "\nNome: " + usuario.nome + "\nGênero: " + usuario.genero + "\nIdade: " + usuario.idade + "\nProfissão: " + usuario.profissao);
	}

}
