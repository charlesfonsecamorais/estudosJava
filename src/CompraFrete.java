import java.util.Scanner;

public class CompraFrete {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFrete = 0.0;
		
		if(valorProduto < 100) {
			valorFrete = 15.0;
		}
		
		Double valorCompra = valorProduto + valorFrete;
		
		imprimeTraco();
		System.out.println("Valor do Produto: R$ " + valorProduto);
		System.out.println("Valor do Frete: R$ " + valorFrete);
		System.out.println("Valor da Compra: R$ " + valorCompra);
		imprimeTraco();
		System.out.println("Volte sempre!");
		
		scanner.close();
	}

	static void imprimeTraco() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
