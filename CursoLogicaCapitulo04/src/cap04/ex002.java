package cap04;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		Double valor = scanner.nextDouble();
		
		Integer frete = 15;
		Double valorFinal = valor + frete;
		Double valorSemFrete = valorFinal;
		if (valor >= 100) {
			valorSemFrete = valorFinal - frete;
			System.out.println("O valor de seu produto é de 100 reais ou mais, o frete sai de graça! Logo o valor final de seu produto é de R$" + valorSemFrete);
		} else {
			System.out.println("O valor de seu produto com o frete é de R$" + valorFinal);
		}
	}
}
