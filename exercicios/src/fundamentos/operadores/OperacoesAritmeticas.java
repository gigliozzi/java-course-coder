package fundamentos.operadores;

public class OperacoesAritmeticas {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println(a % b); //resto da divisao
		System.out.println(8 % 3); //resto da divisao		
	
		System.out.println(x + y - a * b); //regras de precedência (1º multiplicação e divisão)
		
		int p = (int) Math.pow(2, 5);
		System.out.println(p);
		
	}

}
