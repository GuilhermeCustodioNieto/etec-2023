package estudosCaso;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para o seu fatorial: ");
		int numero = scan.nextInt();
		int original = numero;
		int resposta=1;
		
		while (numero!=1) {
			resposta *= numero;
			numero--;
		}
		
		System.out.printf("%d! = %d", original, resposta);
		
		scan.close();
		
		//
	}

}
