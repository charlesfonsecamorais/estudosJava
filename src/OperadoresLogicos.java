
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Nao! Nao aplique o desconto.");
		}
	}

}
