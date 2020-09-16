package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2"); // true
		
		String s1 = new String("2");
		System.out.println("2" == s1); // false
		System.out.println("2".equals(s1)); // false
		
		Scanner entrada = new Scanner(System.in);

		// COMPARAÇÃO DE STRING É VERY IMPORTANT
		String s2 = entrada.next(); // next() tira os espaços em branco
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		

	}

}
