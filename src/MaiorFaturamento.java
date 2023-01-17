
public class MaiorFaturamento {

	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double totalSemanaUm = 0.0;
		Double totalSemanaDois = 0.0;
		Double totalSemanaTres = 0.0;
		Double totalSemanaQuatro = 0.0;
		
		for(int i = 0; i < 7; i++) {
			totalSemanaUm += mes[0][i];
			totalSemanaDois += mes[1][i];
			totalSemanaTres += mes[2][i];
			totalSemanaQuatro += mes[3][i];	
		}
		
		String semana = "1ª semana";
		Double maiorFaturamento = totalSemanaUm;
		
		if (totalSemanaDois > maiorFaturamento) {
			maiorFaturamento = totalSemanaDois;
			semana = "2ª semana";
		}
		if (totalSemanaTres > maiorFaturamento) {
			maiorFaturamento = totalSemanaTres;
			semana = "3ª semana";
		}
		if (totalSemanaQuatro > maiorFaturamento) {
			maiorFaturamento = totalSemanaQuatro;
			semana = "4ª semana";
		}
		System.out.println("A semana de maior faturamento foi a " + semana + " com R$ " + maiorFaturamento);

	}

}
