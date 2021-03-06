package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	// static -> 
	// atributo passa a pertencer � classe e n�o a � inst�ncia
	// define que o atributo pode ser acessado via classe
	// n�o � necess�rio instanciar um objeto desse tipo
	
	// final -> define o valor como constante (n�o poder�
	// ser alterado
	
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
