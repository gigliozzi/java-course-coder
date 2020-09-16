package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		a++; // ou ++a;
		a--; // ou ++b;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // true precendência !!!!!
		System.out.println(a == b); // false
		
		System.out.println(a); // a = 1
		System.out.println(b); // b = 2
		
		
		

	}

}
