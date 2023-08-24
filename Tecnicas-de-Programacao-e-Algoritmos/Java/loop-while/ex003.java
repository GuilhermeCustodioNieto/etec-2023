package exercicioWhile;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, i=1, result;
		System.out.println("Digite um numero para a tabuada: ");
		num = scan.nextInt();
		
		while (i<=10) {
			result = num*i;
			
			System.out.println(num + "x" + i + "=" +result);
			
			i++;
		}
		scan.close();
	}

}
