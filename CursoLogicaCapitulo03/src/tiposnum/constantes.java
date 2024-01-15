package tiposnum;

import java.util.Scanner;

public class constantes {
	
	static final Integer IDADE_MINIMA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//final Integer IdadeMinima = 21;
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		
		scanner.close();
	}
}
