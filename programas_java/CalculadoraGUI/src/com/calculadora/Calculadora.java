package com.calculadora;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Calculadora {

	private static JOptionPane pane;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double a;
        double b;
        String operacao;
        double resultado;
        double i=0;

    
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° Número: "));
        while (i==0){
        operacao = JOptionPane.showInputDialog("Entre com a Operação: " );
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° Número: "));
 
            if (operacao.equals("+")) {
                resultado = a + b;
                JOptionPane.showMessageDialog(null, "O resultado e :" +resultado);
        a = resultado;
        }
     
            if (operacao.equals("-")) {
                resultado = a - b;
        JOptionPane.showMessageDialog(null, "O resultado e :" +resultado);
                a = resultado;
               }
         
            if (operacao.equals("*")) {
                resultado = a * b;
        JOptionPane.showMessageDialog(null, "O resultado e :" +resultado);
                a = resultado;
        }
         
            if (operacao.equals("/")) {
                resultado = a / b;
        JOptionPane.showMessageDialog(null, "O resultado e :" +resultado);
                a = resultado;

        }

        }
    }
}
        

