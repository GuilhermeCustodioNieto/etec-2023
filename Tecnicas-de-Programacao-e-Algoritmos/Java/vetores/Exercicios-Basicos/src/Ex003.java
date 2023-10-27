import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int TAMANHO = 10;
		
		int[] a = new int[TAMANHO];
		int[] b = new int[TAMANHO];
		
		//le o valor de a
		for(int i=0; i<a.length; i++) {
			System.out.printf("digite o %d valor: ", i+1);
			a[i] = scan.nextInt();
		}
		
		//vai de tr�s para frente na variavel a e guarda de frente para tras na variavel b
		int j = 0;
		
		for(int i=(a.length - 1); i>=0; i--) {
			b[j] = a[i];
			j++;
		}
		
		for (int i=0; i<TAMANHO; i++) {
			System.out.printf("C%d: %d%n",i+1, b[i]);
		}
	
		
		scan.close();
		
	}

}
