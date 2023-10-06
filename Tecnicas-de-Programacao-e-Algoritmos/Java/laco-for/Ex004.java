import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int anoAtual=0, anoNasc=0, idadeAtual=0;
		
		int idadeMaisNovo=0, idadeMaisVelho=0;
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("Digite o ano atual");
			anoAtual = scan.nextInt();		
			
			System.out.println("Digite ano nascimento");

			anoNasc = scan.nextInt();
			idadeAtual = anoAtual-anoNasc;
			
			if(i==0) {
				idadeMaisVelho = idadeAtual;
				idadeMaisNovo = idadeAtual;
			}
			
			if(idadeMaisNovo>idadeAtual) {
				idadeMaisNovo = idadeAtual;
			}
			
			if(idadeMaisVelho<idadeAtual) {
				idadeMaisVelho = idadeAtual;
			}
			
			System.out.println("a idade do usuario atual: " + idadeAtual);
		}
		
		
		System.out.println("a idade do mais novo é: " + idadeMaisNovo);
		System.out.println("a idade do mais velho: " + idadeMaisVelho);
		
		scan.close();
	}
}
