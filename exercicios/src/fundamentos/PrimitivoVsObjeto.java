package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "Ol�"; // forma usual
		String m = new String("Mundo"); // forma n�o usual, mas funciona
		System.out.println(s.toUpperCase());
		System.out.println(m.toUpperCase());
		
		// Wrappers = vers�o de objetos para tipo primitivos
		int a = 123;
		System.out.println(a);
		
		
	}
}
