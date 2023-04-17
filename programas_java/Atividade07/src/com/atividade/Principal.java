package com.atividade;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia os objetos
		Random n = new Random();
		Pessoa usuario = new Pessoa(n.nextInt(9999));
		Telefone tel = new Telefone(n.nextInt(9999));
		Endereco end = new Endereco(n.nextInt(9999));
		
		//entrada de dados do usuario
		usuario.setNome(JOptionPane.showInputDialog("Nome:"));
		usuario.setCpf(JOptionPane.showInputDialog("Cpf:"));
		usuario.setEmail(JOptionPane.showInputDialog("E-mail:"));
		
		//entrada de dados do endenreço do usuario
		end.setCep(JOptionPane.showInputDialog("CEP:"));
		end.setUd(JOptionPane.showInputDialog("Unidade da federação:"));
		end.setCidade(JOptionPane.showInputDialog("Cidade:"));
		end.setBairro(JOptionPane.showInputDialog("Bairro:"));
		end.setLogradouro(JOptionPane.showInputDialog("Logradouro:"));
		end.setComplemento(JOptionPane.showInputDialog("Complemento:"));
		end.setNumero(JOptionPane.showInputDialog("Número:"));
		
		//repassa os dados do endereço para o usuário
		usuario.setEnd(end);
		
		//entrada de dados do telefone do usuario
		tel.setTelContato(JOptionPane.showInputDialog("Telefone de contato:"));
		tel.setTelCelular(JOptionPane.showInputDialog("Telefone de Celular:"));

		//repassa os dados do telefone para o usuario
		usuario.setTel(tel);
		
		//saida de dados
		JOptionPane.showMessageDialog(null, "Id do usuário: " + usuario.getIdPessoa() + ".\nNome: " + usuario.getNome() + ".\nCPF: " + usuario.getCpf() + ".\nE-mail: " + usuario.getEmail() + ".\nENDEREÇO:\nCEP: " + usuario.getEnd().getCep() + ".\nUF: " + usuario.getEnd().getUd() + ".\nCidade: " + usuario.getEnd().getCidade() + ".\nBairro: " + usuario.getEnd().getBairro() + ".\nLongradouro: " + usuario.getEnd().getLogradouro() + ".\nComplemento: " + usuario.getEnd().getComplemento() + ".\nNúmero: " + usuario.getEnd().getNumero() + ".\n.\nTELEFONE:\nContato: " + usuario.getTel().getTelContato() + ".\nCelular: " + usuario.getTel().getTelCelular() + ".");
		
		
	}

}
