package metodoinstancia;

public class Produtos {
	String nome;
	Integer qtdeEstoque;
	
	String repor() {
		System.out.println("É necessário repor o produto " + nome + " pois o mesmo possui " + qtdeEstoque + " unidade(s)");
		System.exit(0);
		return repor();
	}
	
	String naoRepor() {
		System.out.println("Não é necessário repor o produto " + nome + " pois o mesmo possui " + qtdeEstoque + " unidade(s)");
		System.exit(0);
		return naoRepor();
	}
}
