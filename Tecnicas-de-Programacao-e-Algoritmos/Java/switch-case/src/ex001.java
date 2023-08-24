import java.util.Scanner;
public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o ano de nascimento do aluno");
		int idadeAluno = scan.nextInt();
		
		switch (idadeAluno){
			case 6:
				System.out.println("CATEGORIA = dente de leite");
				break;
			case 7:
				System.out.println("CATEGORIA = junior");
				break;
			case 8:
				System.out.println("CATEGORIA = junior max");
				break;
			case 9:
				System.out.println("CATEGORIA = junior master");
				break;
			case 10:
				System.out.println("CATEGORIA = master");
				break;
			default:
				System.out.println("essa idade nào é aceita!");
			
		}
		
		scan.close();
	}

}
