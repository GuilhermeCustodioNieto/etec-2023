import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		
		System.out.println("digite o salario do aposentado: ");
		salario = entrada.nextDouble();
		
		if (salario <= 1212.0) {
			double salarioNovo, aumento;
			aumento = (salario*0.05);
			salarioNovo =  salario + aumento;
			
			System.out.printf("o aumento foi de %.2f %n",aumento);
			System.out.println("o salario atual é de: " + salarioNovo);
		}
		
		else {
			double aumento, salarioNovo;
			aumento = salario *0.035;
			salarioNovo = salario + aumento;

			System.out.printf("o aumento foi de  %.2f %n",aumento);
			System.out.println("o salario atual é de: " + salarioNovo);
		}

		entrada.close();
	}

}
