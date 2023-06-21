package application;

import java.util.Scanner;
import java.util.Locale;


public class ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o preço da passagem: ");
		double precoPassagem = scan.nextDouble();
		
		System.out.print("deseja o serviço de despachar? (sim/não) ");
		String despachar = scan.next();
		
		System.out.print("deseja marcar assento? (sim/não) ");
		String marcarAssento = scan.next();
		
		
		double custoTotal = custoViagem(precoPassagem, despachar, marcarAssento);
		System.out.printf("o preço a ser pago pela viagem é de: %.2f", custoTotal);
		
		scan.close();
	}
	
	public static double custoViagem(double precoPassagem, String despachar, String marcarAssento) {
		double custoDespachar = 0;
		int taxaAssento = 0;
		Scanner scan = new Scanner(System.in);
		
		if (despachar.equals("sim")) {
			
			System.out.print("digite a quantidade de volumes de bagagem");
			int volumes = scan.nextInt();
			custoDespachar += 90 * volumes;
		}
		
		if (marcarAssento.equals("sim")) {
			taxaAssento += 60;
		}
		
		scan.close();
		
		double custoTotal = custoDespachar + taxaAssento + precoPassagem;
		return custoTotal;
		
		
	}

}
