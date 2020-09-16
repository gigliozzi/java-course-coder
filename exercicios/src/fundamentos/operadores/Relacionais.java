package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		boolean temDesconto;
		boolean bomComportamento = true;
		double nota = 7.3;
		
		temDesconto = bomComportamento && nota >= 7;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		

	}

}
