package encapsulamento;

public class Encapsulamento {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Enzo Lima";
//		cliente.telefone = "16992497970";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Enzo Lima");
		cliente.setTelefone("16992497970");
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());
		
	}
}
