package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		// pelo uma vez o bloco � executado
		do {
			System.out.println("Voc� precisa"
					+ "\nfalar as palavras m�gicas");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();			
		} while(!texto.equalsIgnoreCase("por favor"));	
		
		
		entrada.close();
		
	}

}
