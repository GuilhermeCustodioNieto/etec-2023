package apostilapg26;
import java.util.Scanner;
public class Dividas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, dividasMaximas;
		
		System.out.println("Digite seu salario: ");
		salario = ler.nextDouble();
		
		dividasMaximas = (salario/100)*30;
		System.out.println("A quantidade de dividas maxima é " + dividasMaximas);

	}

}
