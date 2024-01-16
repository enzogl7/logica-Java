package cap08;

import java.util.Scanner;

public class retornandoValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);

	
		Integer posicaoCursoEscolhido = receberNumero("O curso que você deseja é o ", scanner);
		
		Boolean posicaoValida = verificarPosicao(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			imprimirErro();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoCursoEscolhido(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
			imprimirErro();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static Integer receberNumero(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	
	}
	
	static Boolean verificarPosicao(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
//			System.out.println("[" + i + "] " + vetor[i]);
			imprimir(i + "] " + vetor[i]);
		}
	}
	
	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}
	static void imprimirErro() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
}

