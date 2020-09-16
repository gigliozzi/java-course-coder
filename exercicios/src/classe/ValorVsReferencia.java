package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor
				
		System.out.println("Antes do incremento: " + "a-> " + a + "; e b-> " + b);
			a++;
			b--;
		System.out.println("Ap�s do incremento: " + "a-> " + a + "; e b-> " + b);

		// --------------------------------------
		
		Data d1 = new Data(1, 6, 2022);
		
		Data d2 = d1; // atribui��o por refer�ncia, apontam para o mesmo local em mem�ria
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.FormataData());
		System.out.println(d2.FormataData());
		
		
	}
	
	// void signfica que n�o tem retorno
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
