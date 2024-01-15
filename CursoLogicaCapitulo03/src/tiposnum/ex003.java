package tiposnum;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		System.out.println("Sistema para saber se o aluno passou ou não de ano");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		Boolean passou = nota >= 6;
		
		if (passou) {
			System.out.println("O aluno " + nome + " tirou a nota " + nota + " e passou de ano!");
		} else {
			System.out.println("O aluno " + nome + " tirou a nota " + nota + " e NÃO passou de ano.");
		}
		scanner.close();
	}
}
