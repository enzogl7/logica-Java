package cap04;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da conta de luz: ");
		Double contaLuz = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de água: ");
		Double contaAgua = scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de telefone: ");
		Double contaTelefone = scanner.nextDouble();
		
		System.out.print("Digite o valor da escola do filho: ");
		Double escolaFilho = scanner.nextDouble();
		
		System.out.print("Digite o valor da fatura do cartão:  ");
		Double faturaCartao = scanner.nextDouble();
		
		System.out.print("Digite o valor dos gastos de supermercado:  ");
		Double gastoMercado = scanner.nextDouble();
		
		
		Double gastoTotalMes = contaLuz += contaAgua += contaTelefone += escolaFilho += faturaCartao += gastoMercado;
		System.out.println("O gasto total do mês foi de R$" + gastoTotalMes);
	}
}
