package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		System.out.println(s);		
		System.out.println(s.toUpperCase());		
		s = s.concat("!!!");		
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "William")
				.toUpperCase()
				.concat("@@@");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		int a =32;
		System.out.println(a);
				
		
	}

}
