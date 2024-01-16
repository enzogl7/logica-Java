package cap07;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
			System.out.println("Insira as primeira tarefa do seu dia: ");
			Scanner scanner = new Scanner(System.in);
			String tarefa1 = scanner.next();
			
			System.out.println("Insira a segunda tarefa do seu dia: ");
			String tarefa2 = scanner.next();
			
			System.out.println("Insira a terceira tarefa do seu dia: ");
			String tarefa3 = scanner.next();
			
			System.out.println("Insira a quarta tarefa do seu dia: ");
			String tarefa4 = scanner.next();
			
			System.out.println("Insira a quinta tarefa do seu dia: ");
			String tarefa5 = scanner.next();
			
			String[] todasTarefas = new String[] {tarefa1, tarefa2, tarefa3, tarefa4, tarefa5};
			
			for (int i = 0; i < todasTarefas.length; i++) {
				System.out.println("As tarefas do seu dia são as seguintes: " + todasTarefas[i]);
			}
			
			scanner.close();
			
	}
}
