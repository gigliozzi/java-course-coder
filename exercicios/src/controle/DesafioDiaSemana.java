package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: \n ");
		String dia = entrada.next(); 
		
		
//		//SOLUÇÃO 1
//		if (dia.equalsIgnoreCase("domingo")) {
//			System.out.println("\nDia 1");
//		} else if (dia.equalsIgnoreCase("segunda")) {
//			System.out.println("\nDia 2");
//		} else if (dia.equalsIgnoreCase("terça")) {
//			System.out.println("\nDia 3");
//		} else if (dia.equalsIgnoreCase("quarta")) {
//			System.out.println("\nDia 4");
//		} else if (dia.equalsIgnoreCase("quinta")) {
//			System.out.println("\nDia 5");
//		} else if (dia.equalsIgnoreCase("sexta")) {
//			System.out.println("\nDia 6");
//		} else if (dia.equalsIgnoreCase("sabado")) {
//			System.out.println("\nDia 7");
//		} else {
//			System.out.println("\nDia inválido");	
//		}
//			
//		System.out.println("\nFIM");	
		
		
		//SOLUÇÃO 2
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if ("terça".equalsIgnoreCase(dia)) {
			System.out.println(3); 
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4); 
		}  else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5); 
		}  else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6); 
		}  else if ("sábado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} 	else {
			System.out.println("\nDia inválido");
		}
		
		System.out.println("\nFIM");
		
		entrada.close();

	}

}
