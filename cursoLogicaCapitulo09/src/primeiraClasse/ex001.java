package primeiraClasse;

public class ex001 {

	public static void main(String[] args) {
		ProdutoEX produto = new ProdutoEX();
		produto.nome = "Cadeira";
		produto.qtdeEstoque = 9;
		
		Boolean reposicao = produto.qtdeEstoque < 10;
		
		if (reposicao) {
			reposicaoTrue(produto);
		} else {
			reposicaoFalse(produto);
		}
	}
	
	static void reposicaoTrue(ProdutoEX produto) {
		System.out.println("O produto " + produto.nome + " necessita de reposição de estoque.");
	}
	
	static void reposicaoFalse(ProdutoEX produto) {
		System.out.println("O produto " + produto.nome + " não necessita de reposição de estoque.");
	}

}
