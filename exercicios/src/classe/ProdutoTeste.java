package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco = 3500.00;
//		p1.desconto = 0.25;
		
		// Desafio era fazer agora pelo m�todo static
		// O atributo "desconto" agora pertence � classe
//		Produto.desconto = .50;
		
		System.out.println("Desconto::: " + p1.descontoPadrao());
						
		Produto notebook = new Produto("Acer Aspire GTX", 2850.00);
		
		//outra maneira possivel
		var p2 = new Produto(); 
		p2.nome = "caneta";
		p2.preco = 5.00;
//		p2.desconto = .10;
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.descontoPadrao();
		double precoFinal2 = p2.descontoPadrao();
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2 ;
		
		System.out.printf("media carrinho = R$%.2f.\n", mediaCarrinho);		
		System.out.printf("Produto: %s\nValor: R$%.2f",notebook.nome, notebook.descontoPadrao());
		
		
		
	}
}
