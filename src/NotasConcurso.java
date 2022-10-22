import java.util.Scanner;

public class NotasConcurso {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lingua Portuguesa: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Matematica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Double mediaFinal = notaPortugues + notaMatematica;
		
		Boolean cortePortugues = notaPortugues >= 60.0;
		Boolean corteMatematica = notaMatematica >= 60.0;
		
		Boolean notaCorte = cortePortugues && corteMatematica;
		
		if (notaCorte && mediaFinal >= 150.0) {
			System.out.println("Parabens, voce foi aprovado!");
		} else {
			System.out.println("Infelizmente voce foi reprovado!");
		}
		
		scanner.close();
	}

}
