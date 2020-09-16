package controle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) { // é como dizer: se impar
				continue; // se impar, PULE, não execute esta iteração
				// por isso ele imprime apenas os pares
			}
			System.out.println("i=" + i);
		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) { 
				continue; // pula apenas uma iteração
			}
			System.out.println(i);
		}

	}

}
