package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String texto = "#"; 
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(texto);
//			texto += "#";
//		}
		
		//Minha solu��o
		for(;!texto.equals("######");) {
			System.out.println(texto);
			texto += "#";
		}
		
		//Solu��o do professor
		for(String v= "#";!v.equals("######");v +="#") {
			System.out.println(v);
		}
	}

}
