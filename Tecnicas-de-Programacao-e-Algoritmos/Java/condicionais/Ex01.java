import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double altura, largura, area;
		System.out.println("vamos ver o tamanho de um campo de futebol");
		
		System.out.print("digite a altura: ");
		altura = entrada.nextDouble();
		
		System.out.print("digite a largura: ");
		largura = entrada.nextDouble();
		
		area = altura * largura;
		
		
		if (area >= 110) {
			System.out.println("o campo está no padrão FIFA");
		}
		
		else {
			System.out.println("o campo está fora do padrão FIFA!");
		}
		
		System.out.println("a area do seu campo é: " + area);
		
		entrada.close();
	}

}

