import java.util.Scanner;
public class ex004 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		int c;
		
		c = scan.nextInt();
		
		switch (c) {
			case 1:
				System.out.println("cachorro quente, 8,00 reais");
				break;
			case 2:
				System.out.println("cheeseburger,12,00 reais ");
				break;
			case 3:
				System.out.println(" x-salada,15,00 reais");
				break;
			case 4:
				System.out.println("misto quente,11,00 reais");
				break;
			case 5:
				System.out.println("pão na chapa, 6,00 reais");
				break;
			default:
				System.out.println("Código inexistente");
		}
	}

}
