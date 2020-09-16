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
		// da� posso chamar o m�todo 'toString' diretamente na sa�da
		System.out.println(num1.toString().length());
		
		// Aqui � diferente. Num2 � um primitivo
		// Chama o tipo 'Integer' + toString e passa 
		// o num2 como par�metro
		// da� poder� acessar as fun��es da String
		System.out.println(Integer.toString(num2).length());
		
		
	}
}
