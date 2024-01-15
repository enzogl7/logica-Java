package cap05;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a meta de faturamento anual da empresa: ");
		Double metaAnual = scanner.nextDouble();
		
		System.out.println("Digite o faturamento real da empresa: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.println("Digite a média salarial do funcionário: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Boolean faturamentoRealMaiorQueMeta = faturamentoReal > metaAnual;
		
		Double salarioFinal = 0.0;
		if(faturamentoRealMaiorQueMeta) {
			System.out.println("Parabéns! o faturamento ultrapassou a meta anual, os funcionários receberão um bônus.");
			salarioFinal = mediaSalarial * 80 / 100;
			System.out.println("O funcionário ganhou 80% da média salarial informada, que é R$" + salarioFinal);
		} else if (faturamentoRealMaiorQueMeta == false){
			System.out.println("O faturamento real da empresa foi menor do que a meta, ninguém receberá bônus.");
		}
		scanner.close();
	}

}
