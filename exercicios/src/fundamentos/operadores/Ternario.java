package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		// TERNARIO
		// expressao ? valorSeVerdadeiro : ValorSeFalso
		
		String resultado = media >= 7.0 ? "Aprovador" : "em Recupera��o";
		
		System.out.println("O aluno est� "+ resultado);
		
	}
}
