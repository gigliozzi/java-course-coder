package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		//CASTING
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999; // vai truncar ignorando
		int f = (int) e;		// o que estiver ap�s o ponto
		System.out.println(f);
		
		
				
			
				
		
		
		
	}

}
