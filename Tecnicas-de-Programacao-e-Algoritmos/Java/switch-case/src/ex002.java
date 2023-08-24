import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int birthday, monthBirth;
		String sign = "";
		
		System.out.print("Digite o dia de seu nascimento: ");
		birthday = scan.nextInt();
		
		System.out.print("Digite o ano de seu nascimento: ");
		monthBirth = scan.nextInt();
		
		switch (monthBirth){
		
			// caso janeiro
			case 1:
				if (birthday <= 19) {
					sign = "capricornio";
				}
				else {
					sign = "aquario";
				}
				break;
			 //caso fevereiro
			case 2:
				if (birthday <= 18) {
					sign = "aquario";
				}
				else {
					sign = "peixes";
				}
				break;
			//caso março
			case 3:
				if (birthday <= 19) {
					sign = "peixes";
				}
				else {
					sign = "aries";
				}
				break;
			
			//caso abril
			case 4:
				if (birthday <= 18) {
					sign = "aries";
				}
				else {
					sign = "touro";
				}
				break;
			
			//caso maio
			case 5:
				if(birthday <=19) {
					sign = "touro";
				}
				else {
					sign = "gêmeos";
				}
				break;
			 //caso junho
			case 6:
				if (birthday <= 20) {
					sign = "gêmeos";
				}
				else {
					sign = "câncer";
				}
				break;
			
				//caso julho
			case 7:
				if (birthday <= 21) {
					sign = "câncer";
				}
				else {
					sign = "leão";
				}
				break;
				
			//caso agosto
			case 8:
				if (birthday <= 22) {
					sign = "leão";
				}
				else {
					sign = "virgem";
				}
				break;
			
			//caso setembro
			case 9:
				if (birthday <= 21) {
					sign = "virgem";
				}
				else {
					sign = "libra";
				}
				break;
			
			//caso outubro
			case 10:
				if (birthday <= 22) {
					sign = "libra";
				}
				else {
					sign = "escorpião";
				}
				break;
				
			//caso novembro
			case 11:
				if (birthday <= 21) {
					sign = "escorpião";
				}
				else {
					sign = "sargitario";
				}
				break;
				
			//caso dezembro
			case 12:
				if (birthday <= 21) {
					sign = "sargitario";
				}
				else {
					sign = "capricornio";
				}
				break;
			
			// caso a data seja errada
			default:
				sign = "Data invalida!";
		}
		
		System.out.println("O resultado é: " + sign);
		
		scan.close();
	}

}
