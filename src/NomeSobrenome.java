import java.util.Scanner;

public class NomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		// System.out.println("Nome Completo: " + nome + " " + sobrenome);
		nomeCompleto(nome, sobrenome);
		
		scanner.close();
		
	}
	static void nomeCompleto(String nome, String sobrenome) {
		System.out.println(nome + " " + sobrenome);
	}

}
