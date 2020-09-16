package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informações de um funcionário
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println("Dias de empresa " + anosDeEmpresa * 365);
		
		// Quantidade de viagens
		System.out.println("Viagens feitas " + numeroDeVoos / 2);
		
		// ID do funcionario
		System.out.println("ID do funcionario " + id + "está de férias:" + estaDeFerias + "Ativo:" + status);
		
		// Ponto por Real R$ acumulado
		System.out.println("Pontos por R$ acumulado: " + pontosAcumulados / vendasAcumuladas);
		
		// Salario
		System.out.println("Proventos: " + salario);	
		
		
		// ID do funcionario
		System.out.println("ID do funcionario " + id);		
		
		
	}
	
	

	
	
	
	
	
	
}
;