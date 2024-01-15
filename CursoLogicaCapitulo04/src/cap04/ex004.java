package cap04;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira a idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.println("Insira quantos anos foram contribuídos: ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean podeAposentar = idade >= 55 && contribuicao >= 25;
		if (podeAposentar) {
			System.out.println("Você contribuiu " + contribuicao +  " anos em seus " + idade + " anos de idade e está liberado para se aposentar.");
		} else {
			System.out.println("Você ainda não pode se aposentar.");
		}
	}
}
