package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite salario de junho:");
		String junhoSalario = entrada.nextLine().replace(',', '.');
				
		System.out.println("Digite salario de julho:");	
		String julhoSalario = entrada.nextLine().replace(',', '.');;
		
		System.out.println("Digite salario de agosto:");
		String agostoSalario = entrada.nextLine().replace(',', '.');;
		
		double salario1 = Double.parseDouble(junhoSalario);
		double salario2 = Double.parseDouble(julhoSalario);
		double salario3 = Double.parseDouble(agostoSalario);
		
		System.out.println(salario1);
		
			
		double media = ( (salario1 + salario2 + salario3) / 3) ;
		
		System.out.println("Media é: " + media);
			
		
		entrada.close();
		
	}

}
