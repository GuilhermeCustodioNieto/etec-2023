import java.util.Scanner;
public class Ex002 {

	public static void main(String[] args) {

		final int TAMANHO = 10;
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int [TAMANHO];
		int[] b = new int [TAMANHO];
		int[] c = new int [TAMANHO];
		
		//la�o para leitura do vetor A
		for (int i=0; i<TAMANHO; i++) {
		System.out.print("Entre com o valor de A" + (i+1) + ": ");	
		a[i] =scan.nextInt();
		
		}
		//la�o para leitura do vetor B
		for (int i=0; i<TAMANHO; i++){
		System.out.print("Entre com o valor de B" + (i+1) + ":");
		b[i] = scan.nextInt();
		
		c[i] = a[i] + b[i];
		}
		
		for (int i=0; i<TAMANHO; i++) {
			System.out.printf("C%d, %d%n",i, c[i]);
		}
	
		
		scan.close();
	}

}
