package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "Olá"; // forma usual
		String m = new String("Mundo"); // forma não usual, mas funciona
		System.out.println(s.toUpperCase());
		System.out.println(m.toUpperCase());
		
		// Wrappers = versão de objetos para tipo primitivos
		int a = 123;
		System.out.println(a);
		
		
	}
}
