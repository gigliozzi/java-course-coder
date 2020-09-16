package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2; // os dois trab deram certo
		boolean comprouTv32 = trabalho1 ^ trabalho2; // ele comprou a tv50 e por isso não vai comprar a de 32
		boolean comprouSorvete = trabalho1 || trabalho2; // ele vai comprar sorvete pq pelo menos um dos trab deu certo
		
				
		System.out.println("Comprou TV 50\" ? " + comprouTv50);
		System.out.println("Comprou TV 32\" ? " + comprouTv32);
		System.out.println("Comprou Sorvete ? " + comprouSorvete);
		
		//Operdaor Unário
		boolean maisSuadavel = !comprouSorvete;
		System.out.println(maisSuadavel);
		
	}
}
