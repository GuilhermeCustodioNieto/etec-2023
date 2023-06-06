package apostilapg26;

import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.println("Digite a quarta nota: ");
		nota4 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A media das notas é: " + media);
		ler.close();

	}

}
