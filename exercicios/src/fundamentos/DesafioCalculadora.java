package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite o 1º numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o 2º numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação: +,-,*, / ");
		String operador = entrada.next();
		
		
		// Lógica com ternário
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, operador, num2, resultado);		
		
		
		entrada.close();
		
		
		
	}

}
