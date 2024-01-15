package tiposnum;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Informe a quantidade de produtos comprados: ");
		Integer qtdeProduto = scanner.nextInt();
		
		Double valorTotal = valorProduto * qtdeProduto;
		
		Boolean qtdeProd = qtdeProduto >= 10;
		
		Double PercentualDesconto = 0.0;
		if (qtdeProd) {
			PercentualDesconto = 10.0;
		}
		
		Double desconto = valorTotal * PercentualDesconto / 100;
		Double valorDesconto = valorTotal - desconto;
		System.out.println("Valor total: " + valorDesconto);
		scanner.close();
	}
}
