package tiposnum;

public class tipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		Boolean variavelFalsa = false;
		System.out.println("Variável falsa: " + variavelFalsa);
		
		System.out.println("------------------------------");
		
		Integer idade = 17;
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			System.out.println("Sim! ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! ele(a) não pode tirar carteira.");
		}
		
		
	}
}
