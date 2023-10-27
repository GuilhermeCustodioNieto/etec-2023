import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		final int TAMANHO = 10;
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[TAMANHO];
		int[] b = new int[TAMANHO];
		
		//le o valor de A e guarda sua potencia ao quadrado no vetor b
		for(int i=0; i<a.length; i++) {
			System.out.print("entre com o valor da posi��o " + (i+1) + ": ");
			a[i] = scan.nextInt();
			
			b[i] = a[i] * a[i];
		}
		
		System.out.print("[");
		for(int bAtual : b) {
			if(bAtual == (b.length - 1) || bAtual == b[0]) {
				System.out.println("");
			}
			else {
				System.out.print(", " + bAtual);
			}
			
		}
		System.out.println("]");
		
		scan.close();
	}

}
