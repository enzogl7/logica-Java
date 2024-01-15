package cap04;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-- Calculadora --");
		System.out.println("Qual operação você deseja? [1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão] ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Insira o primeiro número: ");
		Double num1 = scanner.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		Double num2 = scanner.nextDouble();
		
		Double resultado = 0.0;
		if (operacao == 1) {
			resultado = num1 + num2;
			System.out.println("O resultado da sua ADIÇÃO é " +  resultado);
		} if (operacao == 2) {
			resultado = num1 - num2;
			System.out.println("O resultado da sua SUBTRAÇÃO é " + resultado);
		} if (operacao == 3) {
			resultado = num1 * num2;
			System.out.println("O resultado da sua MULTIPLICAÇÃO é " + resultado);
		}
		if (operacao == 4) {
			resultado = num1 / num2;
			System.out.println("O resultado da sua DIVISÃO é " + resultado);
		} if (operacao > 4) {
			System.out.println("Valor inválido. Tente novamente");
		} if (operacao < 1) {
			System.out.println("Valor inválido. Tente novamente.");
		}
		
		scanner.close();
		}
}
