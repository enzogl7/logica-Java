package cap05;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o peso: ");
		Double peso = scanner.nextDouble();
		
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoPesado = peso > 90;
		
//		if (pesoLeve) {
//			System.out.println("O lutador é peso leve.");
//		} else {	
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			
//			if (pesoMedio) {
//				System.out.println("O lutador é peso médio.");
//			} else {
//				Boolean pesoPesado = peso > 90;
//				if (pesoPesado) {
//				System.out.println("O lutador é peso pesado.");
//				}
//			}
//		}
			
		
		Boolean pesoLeve = peso <= 60 && peso > 0;
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("O lutador é peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador é peso médio.");
		} else if (pesoPesado) {
			System.out.println("O lutador é peso pesado.");
		} else {
			System.out.println("O lutador não se encaixa em categoria nenhuma.");
		}
		
		
		scanner.close();
	}

}
