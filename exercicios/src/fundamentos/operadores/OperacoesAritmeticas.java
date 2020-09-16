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
	
		System.out.println(x + y - a * b); //regras de preced�ncia (1� multiplica��o e divis�o)
		
		int p = (int) Math.pow(2, 5);
		System.out.println(p);
		
	}

}
