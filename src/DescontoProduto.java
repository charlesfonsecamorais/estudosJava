import java.util.Scanner;

public class DescontoProduto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor do Produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Quantidade: Un ");
		Integer quantProduto = scanner.nextInt();
		
		Double valorCompra = valorProduto * quantProduto;
		
		Double valorDesconto = 0.1;
		
		Double valorTotal = 0.0;
		
		if (quantProduto >= 10) {
			valorTotal = valorCompra - (valorCompra * valorDesconto);
		} else {
			valorTotal = valorCompra;
		}
		
		System.out.println("VALOR A PAGAR: R$ " + valorTotal);
		
		scanner.close();
	}

}
