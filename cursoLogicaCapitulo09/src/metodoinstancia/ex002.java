package metodoinstancia;

public class ex002 {
	public static void main(String[] args) {
		Produtos produtos = new Produtos();
		produtos.nome = "Teclado";
		produtos.qtdeEstoque = 5;
		
		Boolean reposicao = produtos.qtdeEstoque < 10;
	
		if (reposicao) {
			produtos.repor();
		} else {
			produtos.naoRepor();
		}
	}
	
}
