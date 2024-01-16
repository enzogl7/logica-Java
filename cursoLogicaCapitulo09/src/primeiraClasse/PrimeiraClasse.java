package primeiraClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		produto produto = new produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQtdeEmEstoque(produto);
		
	}
	static void exibirQtdeEmEstoque(produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + " é " + produto.quantidade + " unidade(s).");
		}		
}
