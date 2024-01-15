package cap04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
				
		if(aplicarDesconto) {
			System.out.println("Sim! aplique o desconto.");
		} else {
		System.out.println("Não aplique o desconto.");
		}
	}

}
