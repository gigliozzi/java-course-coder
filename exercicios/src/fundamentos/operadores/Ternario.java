package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		// TERNARIO
		// expressao ? valorSeVerdadeiro : ValorSeFalso
		
		String resultado = media >= 7.0 ? "Aprovador" : "em Recuperação";
		
		System.out.println("O aluno está "+ resultado);
		
	}
}
