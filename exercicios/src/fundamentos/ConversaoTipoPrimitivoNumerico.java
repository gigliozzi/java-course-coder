package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		//CASTING
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999; // vai truncar ignorando
		int f = (int) e;		// o que estiver após o ponto
		System.out.println(f);
		
		
				
			
				
		
		
		
	}

}
