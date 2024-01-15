package tiposnum;
import java.util.Scanner;

public class tipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		
		System.out.println("Olá, " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'A';
	}
}
