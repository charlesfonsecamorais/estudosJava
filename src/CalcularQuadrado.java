import java.util.Scanner;

public class CalcularQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para descobrir o seu quadrado: ");
		Double entradaNumero = scanner.nextDouble();
		
		Double Quadrado = entradaNumero * entradaNumero;
		
		System.out.println("O quadrado de " + entradaNumero + " e igual a: " + Quadrado);
		
		scanner.close();
	}

}
