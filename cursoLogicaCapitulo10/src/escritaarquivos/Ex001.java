package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		System.out.println("eSCREVA");
		String escolha = scanner.next();
		
		System.out.print("Escreva sua tarefa: ");
		String tarefa = scanner.next();
		linhas.add(tarefa);
		
		
		Boolean parar = escolha != "x";
		while (parar) {
			System.exit(0);
		}
		
		
		Path arquivo = Paths.get("C:\\Users\\ogl\\Desktop\\Lógica Java - Myp7\\logica-Java\\ex001-aula10.3.txt");
		Files.write(arquivo, linhas);
		System.out.println("FIM");
		
		scanner.close();
	}

}
