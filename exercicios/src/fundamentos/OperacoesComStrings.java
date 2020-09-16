package fundamentos;

public class OperacoesComStrings {
	
	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2)); // seq come�a com 0, 1, 2
		
		String s = "Boa tarde"; // string original
		
		// manipula��es
		System.out.println(s.concat("!!!"));
		System.out.println(s + "@");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.replace("Boa tarde", "boa noite"));
		System.out.println(s.replace("a", "i"));
		
		// Output
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1590.3598;
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " +
						sobrenome + "\nIdade: " + idade + "\nSalario: " 
						+ salario);		
		
		
		//Melhorando o output %s espa�o; %f lida com n�meros de ponto flutuante
		System.out.printf("O senhor %s %s tem %d anos e percebe sal�rio de R$ %.2f", nome, sobrenome, idade, salario);
	
		//Outra maneira de fazer
		String frase = String.format("\nO senhor %s %s tem %d anos e percebe sal�rio de R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//Outras funcionalidades das Strings
		System.out.println("Testando as strings 2020".codePointAt(1));
		System.out.println("Testando as strings 2020".compareTo(frase));
		
	}

}
