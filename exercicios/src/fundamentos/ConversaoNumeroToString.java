package fundamentos;

public class ConversaoNumeroToString {

	public static void main(String[] args) {
		
		// modo 1 (usando wrapper)
		Integer num1 = 10000; // tipo Wrapper "Integer" 
		System.out.println("Num1: " + num1.toString());
		
		// modo 2 (usando tipo primitivo + wrapper no output)
		int num2 = 5678988; // tipo primitivo 
		System.out.println("Num2: " + Integer.toString(num2));
		
		// num1 foi usado o modo Warpper
		// daí posso chamar o método 'toString' diretamente na saída
		System.out.println(num1.toString().length());
		
		// Aqui é diferente. Num2 é um primitivo
		// Chama o tipo 'Integer' + toString e passa 
		// o num2 como parâmetro
		// daí poderá acessar as funções da String
		System.out.println(Integer.toString(num2).length());
		
		
	}
}
