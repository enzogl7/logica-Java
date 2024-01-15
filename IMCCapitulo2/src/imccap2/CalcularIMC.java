package imccap2;
import java.util.Scanner;
public class CalcularIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		Double altura = scanner.nextDouble();
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double IMC = peso / alturaAoQuadrado;
		
		System.out.println("O IMC com as informações fornecidas é: " + IMC);
		
		scanner.close();
	}

}
