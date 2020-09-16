package controle;

public class For3 {

	public static void main(String[] args) {
		
		// ESCOPO DE DE VARIÁVEIS
		// a variavel só pode ser acessada dentro do FOR
//		for(int i = 0; i < 10 ; i++) {
//			System.out.println("i= " + i);
//		}
		
		//FOR DENTRO DE FOR
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("%d %d %n", i, j);
			}
		}
			

	}

}
