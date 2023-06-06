import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		int numero;
		
		System.out.println("Insira um numero: ");
		numero = entrada.nextInt();
		
		
		
		if (numero % 2 == 0) {
			System.out.println("é par");
		}
		
		else {
			System.out.println("é impar");
		}

		entrada.close();
	}

}
