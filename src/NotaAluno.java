import java.util.Scanner;

public class NotaAluno {
	
	static final Double MEDIA_MINIMA_APROVACAO = 7.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		Double notaUm = scanner.nextDouble();
		
		System.out.print("Nota 2: ");
		Double notaDois = scanner.nextDouble();
		
		Double mediaFinal = (notaUm + notaDois) / 2;
		
		if (mediaFinal >= MEDIA_MINIMA_APROVACAO) {
			System.out.println("Parabens, voce foi aprovado!");
		}
		else {
			if (mediaFinal >= 5) {
				System.out.println("Voce esta de recuperacao!");
			}
			else {
			System.out.println("Voce foi reprovado!");
			}
		}
		
		scanner.close();
	}
}
