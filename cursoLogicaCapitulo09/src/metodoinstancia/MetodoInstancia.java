package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Enzo";
		cliente.ultimoNome =  "Lima";
		cliente.telefone = "16992497970";
		cliente.email = "enzolima527@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Wallace";
		cliente2.ultimoNome = "Lima";
		cliente2.telefone = "1691823474";
		cliente.email = "wallaceglima@gmail.com";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + " DDD: " + cliente2.obterDDD());
	}
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		return nomeCompleto;
//	}
}
