import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu Peso (Kg): ");
		Double Peso = scanner.nextDouble();
		
		System.out.print("Informe sua altura (m): ");
		Double Altura = scanner.nextDouble();

		Double valorIMC = Peso / (Altura * Altura);
		
		System.out.print("Valor do IMC: " + valorIMC);
		
		scanner.close();
	}
}
