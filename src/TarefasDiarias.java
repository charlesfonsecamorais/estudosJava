import java.util.Scanner;

public class TarefasDiarias {
	
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefasDiarias = new String[5];
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite a " + i + "ª tarefa do dia: ");
			tarefasDiarias[i-1] = scanner.nextLine();
		}
		System.out.println("--------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "ª tarefa do dia: " + tarefasDiarias[i]);
		}
		scanner.close();
		
	}

}
