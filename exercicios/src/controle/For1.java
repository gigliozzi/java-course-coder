package controle;

public class For1 {

	public static void main(String[] args) {
		
		// forma tradicional (quantidade determinada)
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		//inicializar contador fora do FOR
		int x = 2;
		for(;x <= 10;) {
			System.out.println("x = " + x);
			x++;
		}

		
		//FOR infinito (vou comentar o codigo para não
		// levar um susto
//		for(;;) {
//			System.out.println("infnito");
//		}
//		
		
	}

}
