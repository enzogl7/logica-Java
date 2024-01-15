package cap05;

public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean contaTemTempoSuficienteDeAbertura = true;
		Boolean nomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& contaTemTempoSuficienteDeAbertura
//				&& nomeLimpo;
		
		if(((movimentacaoMedia * 2) >= emprestimo)
				&& contaTemTempoSuficienteDeAbertura && nomeLimpo) {
			System.out.println("Sim! Pode liberar empréstimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}

	}

}
