package fundamentos;

import java.util.Scanner;

public class OperacoesDeConsole {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.print("Bom");
		System.out.print("dia");
		
		//Print formatado (\n querbra linha, %n quebra linha)
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6); // %d dígito
		System.out.printf("Salário: %.2f", 2250.91678); // %.2f arredonda a saida
		System.out.printf("Nome %s%n", "joão");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();		
		
		
	}
}
