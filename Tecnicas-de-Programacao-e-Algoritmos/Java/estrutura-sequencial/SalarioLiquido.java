package apostilapg26;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double hAula, aulasDadasMes, percentDesc, aulas, salLiq, desc;
		System.out.println("Digite o valor da hora por aula");
		hAula = ler.nextDouble();
		System.out.println("Digite o número de aulas dadas por mês");
		aulasDadasMes = ler.nextDouble();
		System.out.println("Digite o percentual do desconto do INSS");
		percentDesc = ler.nextDouble();
		aulas=hAula*aulasDadasMes;
		desc=percentDesc/100*aulas;
		salLiq=aulas-desc;
		System.out.println("Seu salário líquido é "+salLiq);
		
	}
	
	
	
	
}
