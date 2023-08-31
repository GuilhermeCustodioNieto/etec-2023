	package estudosCaso;
	
	import java.util.Scanner;
	
	public class potencia {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("digite a base");
			int base = scan.nextInt();
			System.out.println("digite o expoente");
			int expoente = scan.nextInt();
			
			int soma=base;
			int i=0;
			
			expoente -= 1;
			
			while (i!=expoente) {
				soma *= base;
				i++;
			}
			
			System.out.printf("a potencia de %d elevado a %d é %d", base, expoente,soma );
			
			scan.close();
		}
	
	}