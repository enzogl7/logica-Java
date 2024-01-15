package cap05;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira a nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Insira a nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean passou = notaPortugues >= 60 && notaMatematica >= 60;
		if (passou) {
			System.out.println("Você passou e garantiu sua vaga!");
		} else {
			System.out.println("Você não passou.");
		}
		scanner.close();
	}
}
