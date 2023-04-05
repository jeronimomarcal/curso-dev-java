package com.construtorveiculo;

import javax.swing.JOptionPane;

public class VeiculoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instancia objeto
		Veiculo automovel = new Veiculo("7e4 aDGtdF b6 FH2703", 2018);
		
		//entrada de dados
		automovel.fabricante = JOptionPane.showInputDialog("Informe o fabticante:");
		automovel.modelo = JOptionPane.showInputDialog("Informe o modelo:");
		automovel.cor = JOptionPane.showInputDialog("Informe a cor:");
		automovel.placa = JOptionPane.showInputDialog("Informe a placa");
		
		// saida de dados
		JOptionPane.showMessageDialog(null, "Fabricante; " + automovel.fabricante + "\nModelo: " + automovel.modelo + "\nCor: " + automovel.cor + "\nPlaca: " + automovel.placa + "\nAno: " + automovel.ano + "\nChassi: " + automovel.chassi + ".");

		
	}

}
