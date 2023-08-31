package estudosCaso;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite ate que numero será feita a formula de FIBONACCI ");
		int enesimo = scan.nextInt();
		
		int i=1, ultimo=1, penultimo=1;
		int resposta=0;
		
		enesimo -= 2;
		while (i<=enesimo) {
			resposta = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = resposta;
			i++;
		}
		System.out.println("O resultado da Formula de Fibonacci é: " + resposta);
		
		scan.close();

	}

}
