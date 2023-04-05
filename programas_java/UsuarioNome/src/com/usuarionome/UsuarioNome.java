package com.usuarionome;

import javax.swing.JOptionPane;

public class UsuarioNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declração de variavel
		String nome;
		
		//entrada de dados
		nome = JOptionPane.showInputDialog("Informe o seu nome:");
		
		//saida de dados
		JOptionPane.showMessageDialog(null, "Nome: " + nome + ".");

	}

}
