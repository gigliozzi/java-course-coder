package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();
		
		Data nascimentoWill = new Data();
		Data birdDateKaren = new Data(31,5,1979);
		
		System.out.println("Data default: " + nascimentoWill.FormataData());
		System.out.println("BirdDate karen: " + birdDateKaren.FormataData());
		
		d1.dia = 5;
		d1.mes = 8;
		d1.ano = 2006;
		
		System.out.println(d1.FormataData());
			

		d2.dia = 13;
		d2.mes = 6;
		d2.ano = 2013;
		
		System.out.println(d2.FormataData());
		

	}

}
