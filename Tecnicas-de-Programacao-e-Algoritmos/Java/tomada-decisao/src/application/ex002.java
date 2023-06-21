package application;

import java.util.Scanner;
import java.util.Locale;


public class ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o salario para o calculo do imposto de renda: ");
		double salario = scan.nextDouble();
		
		impostoRenda(salario);
		scan.close();
	}
	//criação de metodo que calcula o imposto de renda de acordo com o salario do usuario
	
	public static void impostoRenda(double salarioPessoa) {
		if (salarioPessoa <= 1903.98) {
			System.out.println("Não é necessário pagar nada");
		}
		else if (1903.99 <= salarioPessoa || salarioPessoa <=2826.65) {
			double valorImposto = ((salarioPessoa /100) * 7.5) - 142.80;
			System.out.printf("O imposto da pessoa a ser pago é de %.2f", valorImposto);
		}
		else if (2826.66 <= salarioPessoa || salarioPessoa <= 3751.05) {
			double valorImposto = ((salarioPessoa/100) * 15.0) - 354.80;
			System.out.printf("O imposto da pessoa a ser pago é de %.2f", valorImposto);
		}
		else if (3751.06 <= salarioPessoa || 4664.68 <= salarioPessoa) {
			double valorImposto = ((salarioPessoa/100) * 22.5) - 636.13;
			System.out.printf("O imposto da pessoa a ser pago é de %.2f", valorImposto);
			
		}
		else if (salarioPessoa > 4664.68) {
			double valorImposto = ((salarioPessoa /100) * 27.5) - 869.36;
			System.out.printf("O imposto da pessoa a ser pago é de %.2f", valorImposto);
		}
		
	}
	
}

