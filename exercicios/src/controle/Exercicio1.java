package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
					
		System.out.println("Informe o valor");
		int valor = entrada.nextInt();
		
		boolean range = (valor >= 0 && valor <= 10);
		
		if(valor % 2 == 0) {
			System.out.println(valor + " � par");
			System.out.println("Est� em 0 e 10: " + range);
		} else {
			System.out.println(valor + " � �mpar");
			System.out.println("Est� em 0 e 10: " + range);
		}
				
		entrada.close();

	}

}
