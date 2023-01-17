import java.util.Scanner;

public class Aposentadoria {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo de Aposentadoria");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.print("Digite a idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite o tempo de contribuição: ");
		Integer tempoContribuicao = scanner.nextInt();
		
		Boolean aposentadoria = idade >= 55 && tempoContribuicao >= 25;
		
		if (aposentadoria) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Você já pode se aposentar.");
		} else {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Você ainda não está apto para a aposentadoria.");
		}
		
		scanner.close();
	}

}
