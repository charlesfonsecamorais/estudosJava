import java.util.Scanner;

public class TabuadaRecursiva {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		System.out.println("     	TABUADA");
		imprimirTraco();
		
		System.out.print("Digite um número e descubra a sua tabuada: ");
		Integer tabuada = scanner.nextInt();
		
		imprimirTabuada(tabuada, 0);
		
//		Integer resultado = 0;
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(tabuada + " X " + i + " = " + resultado);
//		}
		
		scanner.close();
		
	}
	
	static void imprimirTabuada(Integer numero, int i) {
		
		if(i <= 10) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
			i++;
			
		imprimirTabuada(numero, i);
		
		}
	}
	
	static void imprimirTraco() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}
