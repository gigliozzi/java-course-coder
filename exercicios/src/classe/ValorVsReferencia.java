package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor
				
		System.out.println("Antes do incremento: " + "a-> " + a + "; e b-> " + b);
			a++;
			b--;
		System.out.println("Após do incremento: " + "a-> " + a + "; e b-> " + b);

		// --------------------------------------
		
		Data d1 = new Data(1, 6, 2022);
		
		Data d2 = d1; // atribuição por referência, apontam para o mesmo local em memória
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.FormataData());
		System.out.println(d2.FormataData());
		
		
	}
	
	// void signfica que não tem retorno
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
