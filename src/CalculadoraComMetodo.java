import java.util.Scanner;

public class CalculadoraComMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-=-=-= CALCULADORA =-=-=-");
		System.out.println("");
		System.out.println("1 - Adição;");
		System.out.println("2 - Subtração;");
		System.out.println("3 - Multiplicação;");
		System.out.println("4 - Divisão.");
		System.out.println("");
		
		System.out.print("Digite o primeiro valor: ");
		Double valor01 = scanner.nextDouble();
		
		System.out.print("Digite a operação desejada: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		Double valor02 = scanner.nextDouble();
		
		String operador = "";
		Double resultado = 0.0;
		
		switch(operacao) {
		case 1: 
			resultado = soma(valor01, valor02);
			operador = " + ";
			break;
		case 2:
			resultado = subtracao(valor01, valor02);
			operador = " - ";
			break;
		case 3:
			resultado = multiplicacao(valor01, valor02);
			operador = " X ";
			break;
		case 4:
			resultado = divisao(valor01, valor02);
			operador = " / ";
			break;
		}
		
		
		System.out.println("");
		System.out.println("-=-=-= RESULTADO =-=-=-");
		System.out.println("");
		System.out.println(valor01 + operador + valor02 + " = " + resultado);
		
		scanner.close();

	}
	
	static Double soma(Double val01, Double val02) {
		return val01 + val02;
	}
	
	static Double subtracao(Double val01, Double val02) {
		return val01 - val02;
	}
	
	static Double multiplicacao(Double val01, Double val02) {
		return val01 * val02;
	}
	
	static Double divisao(Double val01, Double val02) {
		return val01 / val02;
	}
}
