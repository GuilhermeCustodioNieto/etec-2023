package apostilapg26;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	System.out.println ("Digite o seu nome");
		String nome=ler.next();
		int anoNasc, anoAtual, idade;
		System.out.println ("Digite o seu ano de nascimento");
		anoNasc=ler.nextInt();
		System.out.println ("Digite o ano atual");
		anoAtual=ler.nextInt();
		idade=anoAtual-anoNasc;
		System.out.println (nome+", você tem " +idade+" anos");
		ler.close();
		
		
		
		
	}
}
