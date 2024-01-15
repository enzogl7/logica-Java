package cap05;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um dia da semana [1 a 7]: ");
		Integer diaNum = scanner.nextInt();
		String dia = "";
		switch(diaNum) {
		case 1: dia = "Domingo";
			break;
		case 2: dia = "Segunda";
			break;
		case 3: dia = "Terça";
			break;
		case 4: dia = "Quarta";
			break;
		case 5: dia = "Quinta";
			break;
		case 6: dia = "Sexta";
			break;
		case 7: dia = "Sábado";
			break;
		default: 
			System.err.println("Digite um dia válido");
			System.exit(0);
		}
		System.out.println("O dia " + diaNum + " é " + dia);
		scanner.close();

	}

}
