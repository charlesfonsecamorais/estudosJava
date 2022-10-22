import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		Double numero01 = scanner.nextDouble();
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1 - SOMA ");
		System.out.println("2 - SUBTRACAO ");
		System.out.println("3 - MULTIPLICACAO ");
		System.out.println("4 - DIVISAO ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=");
		
		System.out.print("Digite a operacao desejada: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite outro numero: ");
		Double numero02 = scanner.nextDouble();
		
		if (operacao == 1) {
			Double resultado = numero01 + numero02;
			System.out.println(numero01 + " + " + numero02 + " = " + resultado);
		} else {
			if (operacao == 2) {
				Double resultado = numero01 - numero02;
				System.out.println(numero01 + " - " + numero02 + " = " + resultado);
			} else {
				if (operacao == 3) {
					Double resultado = numero01 * numero02;
					System.out.println(numero01 + " X " + numero02 + " = " + resultado);
				} else {
					if (operacao == 4) {
						Double resultado = numero01 / numero02;
						System.out.println(numero01 + " / " + numero02 + " = " + resultado);
					} else {
						System.out.println("Operacao invalida! Tente novamente.");
					}
				}
			}
		}
		
		scanner.close();
	}

}
