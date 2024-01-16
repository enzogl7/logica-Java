package cap08;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		System.out.println("-- Calculadora --");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite qual operação deseja fazer [1 - Adição / 2 - subtração]");
		Integer escolha = scanner.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		Double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		Double num2 = scanner.nextDouble();
				
			if (escolha == 1) {
				adicao(num1, num2);
		}
			if (escolha == 2) {
				subtracao(num1, num2);
		}
		
		scanner.close();

	}
	static Double adicao(Double num1, Double num2) {
		Double resultadoAdicao = num1 + num2;
		System.out.println("O resultado da adição é: " + resultadoAdicao);
		return resultadoAdicao;
	}
	static Double subtracao(Double num1, Double num2) {
		Double resultadoSubtracao = num1 = num2;
		System.out.println("O resultado da subtração é: " + resultadoSubtracao);
		return resultadoSubtracao;
	}

}
