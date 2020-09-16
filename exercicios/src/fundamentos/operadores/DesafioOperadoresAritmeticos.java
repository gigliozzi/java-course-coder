package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		double a = (Math.pow(6 * (3 + 2), 2)) / (3 * 2);
		double b = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		double numerador = Math.pow((a - b),3);
		double denominador = Math.pow(10,3);
		double resultado = numerador / denominador;
		System.out.println("Resultado = " + resultado);
		
	}
}
