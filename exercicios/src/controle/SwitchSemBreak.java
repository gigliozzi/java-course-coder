package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Faixa preta");
		case "marrom":
			System.out.println("Faixa marrom");
		case "roxa":
			System.out.println("Faixa roxa");
		case "verde":
			System.out.println("Faixa verde");
		case "laranja":
			System.out.println("Faixa laranja");
		case "vermelha":
			System.out.println("Faixa vermelha");
		case "amarela":
			System.out.println("Faixa amarela");
			break;
		default:
			System.out.println();
		}
		
		int idade = 54;
		switch (idade) {
		case 18:
			System.out.println("Chance no mundo da programação:");
			System.out.println("Chance altíssima de sucesso");
			break;
		case 25:
			System.out.println("Chance no mundo da programação:");
			System.out.println("Chance boa de sucesso");
			break;
		case 35:
			System.out.println("Chance no mundo da programação:");
			System.out.println("Chance regular de sucesso");
			break;
		case 45:
			System.out.println("Chance no mundo da programação:");
			System.out.println("Chance pouco provável de sucesso");
		default:
			System.out.println("Chance no mundo da programação:");
			System.out.println("Chance improvável de sucesso");			
			break;
		}
	}

}
