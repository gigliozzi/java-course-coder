package fundamentos;

import javax.swing.JOptionPane; 

public class ConversaoStringToNumero {

	public static void main(String[] args) {
	
		String valor1 = JOptionPane.showInputDialog(
				"Digite o 1º numero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o 2º numero:");
		
		System.out.println(valor1 + valor2);
		
		// função p converter string em valor numerico
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		double media = (numero1 + numero2) / 2 ;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);		
			
	}
	
}
