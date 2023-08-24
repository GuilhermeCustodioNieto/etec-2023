package exercicioWhile;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0, maior=0, menor=0, idade;
		
		while(i<=10) {
			idade = scan.nextInt();
			
			if (idade >= 18){
				maior++;
			}
			else {
				menor++;
			}
			
			i++;
		}
		
		System.out.println("pessoas maiores de idade: " + maior);
		System.out.println("pessoas menores de idade: " + menor);
		
		scan.close();
	}

}
