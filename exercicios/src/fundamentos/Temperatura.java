package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// Formula de convers�o
		// (�F - 32) x 5/9 = �C
		
		final double fator = 5.0/9.0;
		final double constante = 32.0;
		double F;
		
		F = 86;
		
		double resultado = (F - constante) * fator;
		
		
		System.out.println(F + "�" + " equivale a " + resultado + "� Celsius");		
		
		 
	}

}
