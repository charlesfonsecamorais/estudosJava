import java.util.Scanner;

public class VariavelComposta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		Integer[] lista = new Integer[5];
		
		for(int i = 0; i < lista.length; i++) {
			System.out.print("Digite um número: ");			
			numero = scanner.nextInt();
			lista[i] = numero;
		}
		System.out.println("--------------------------");
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1) + "º número escolhido: " + lista[i]);
		}
		
		scanner.close();

	}
	
}
