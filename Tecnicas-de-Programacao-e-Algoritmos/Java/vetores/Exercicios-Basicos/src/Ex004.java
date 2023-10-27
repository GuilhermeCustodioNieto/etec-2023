import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int TAMANHO = 10;
		
		
		double media, soma=0;
		
		int[] a = new int[TAMANHO];
		
		for (int i=0; i<TAMANHO; i++) {
			System.out.print("Entre com o " + (i+1) + " valor: ");
			a[i] = scan.nextInt();
		}
		
		//faz a soma dos valores, e divide pelo tamanho do vetor
		for(int atualA : a) {
			soma += atualA;
		}
		
		media = (soma / a.length);
		
		System.out.println("A MEDIA É " + media);
		
		scan.close();
	}

}
