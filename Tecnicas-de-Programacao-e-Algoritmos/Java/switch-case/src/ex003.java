import java.util.Scanner;
public class ex003 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mb, b, r, i, total, pmb, pb, pr, pi, quantNotas;
		
		System.out.println("Digite as notas de alunos que tiraram MB");
		mb = scan.nextInt();
		
		System.out.println("Digite as notas de alunos que tiraram B");
		b = scan.nextInt();
		
		System.out.println("Digite as notas de alunos que tiraram R");
		r = scan.nextInt();
		
		System.out.println("Digite as notas de alunos que tiraram I");
		i = scan.nextInt();
		
		total = mb + b + r + i;
		
		pmb = 0;
		pb = 0; 
		pr = 0; 
		pi = 0;
		
		quantNotas = 1;
		
		switch (quantNotas) {
			case 1:
				pmb = (total/100) * mb;
				quantNotas++;
				break;
		}
		
		switch (quantNotas) {
			case 2:
				pb = (total/100) * b;
				quantNotas++;
				break;
		}
		
		switch (quantNotas) {
			case 3:
				pr = (total/100) * r;
				quantNotas++;
				break;
		}
		
		switch (quantNotas) {
			case 4:
				pi = (total/100) * i;
				quantNotas++;
				break;
		}
		
		
		System.out.println("A porcentagem de alunos com MB é de: " + pmb);
		System.out.println("A porcentagem de alunos com B é de: " + pb);
		System.out.println("A porcentagem de alunos com R é de: " + pr);
		System.out.println("A porcentagem de alunos com I é de: " + pi);
		
		scan.close();
	}
	
}
