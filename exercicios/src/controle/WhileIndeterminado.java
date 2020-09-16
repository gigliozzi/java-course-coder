package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite a palavra chave: ");
		
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.println("Digite a palavra chave: ");
			palavra = entrada.nextLine();
		}
		
		
		
		
		
		entrada.close();
		
	}

}
