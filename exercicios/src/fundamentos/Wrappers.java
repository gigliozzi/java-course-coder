package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
	//Wrappers de tipos primitivos começam com letra Maiúscula Byte, Integer, Boolean
			
	// byte
	Byte b = 100;
	Short s = 1000;
	
	// Integer.parseInt(entrada.next());
	Integer i = 10000;
	Long l = 100000L;
	
	System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i * 3);
	System.out.println(l / 3);
	
	// Convertendo uma string para boolean e vice-versa
	Boolean bo = Boolean.parseBoolean("true"); //string para boolean
	System.out.println(bo);
	System.out.println(bo.toString().toUpperCase()); // boolean para string
	
	Character c = '#'; // Wrapper char 
	System.out.println(c + "...");
	
}	
	
	
}
