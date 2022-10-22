import java.util.Scanner;

public class CalcularTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor pago pelo cliente: R$ ");
		Double valorPago = scanner.nextDouble();
		
		Double valorTroco = valorPago - valorProduto;

		System.out.println("Valor do Troco: R$ " + valorTroco);
		
		scanner.close();
	}
}
