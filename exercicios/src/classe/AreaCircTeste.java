package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
//		System.out.println(AreaCirc.PI); // direto
		
		// 1� forma: instanciando o objeto
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;		
		System.out.println(a1.area());
		
			
		// 2� forma: direto a partir da classe
		double resultado = AreaCirc.area(10);		
		System.out.println(resultado);
		
		
		
		

	}

}
