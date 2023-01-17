import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-=-=-=-=-= REGRA DE TRÊS SIMPLES =-=-=-=-=-");
		System.out.println("");
		System.out.println("VALOR ---------- 100%");
		System.out.println("  X   ----------  P %");
		System.out.println("");
		System.out.println("Exemplo: ");
		System.out.println("Quanto é 12% de R$ 800,00?");
		System.out.println("");
		System.out.println("800,00 ---------- 100%");
		System.out.println("   X   ----------  12%");
		System.out.println("");
		System.out.println("Onde,");
		System.out.println("'VALOR' = 800,00");
		System.out.println("'X' = Valor que desejamos saber");
		System.out.println("'P' = 12%");
		System.out.println("");
		
		System.out.print("Digite o 'VALOR': ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Digite a porcentagem 'P': ");
		Double porcentagem = scanner.nextDouble();
		
		System.out.println(porcentagem + "% de " + valor + " é igual a " + regraDeTres(valor, porcentagem));
		
		scanner.close();
		
	}
	
	static Double regraDeTres(Double valor, Double proporcao) {
		Double resultado = (valor * proporcao) / 100.00;
		return resultado;
	}
}
