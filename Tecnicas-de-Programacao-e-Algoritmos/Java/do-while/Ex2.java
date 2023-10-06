import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String sexo;
		double altura, pesoIdeal, peso;
		int desejaContinuar=1;
				
		do{
			System.out.print("Digite  o sexo: ");
			sexo = scan.next();
			
			System.out.print("Digite  a altura: ");
			altura = scan.nextDouble();
			
			System.out.print("Digite o peso: ");
			peso = scan.nextDouble();
			
			altura *= 100;
		    if(sexo.equalsIgnoreCase("m")) {
			    pesoIdeal = 52 + (0.75 * (altura - 152.4));
		}
		    else if(sexo.equalsIgnoreCase("f")){
		        pesoIdeal = 52  + (0.69 *  (altura-152.4));
		}
		    else {
		    	System.out.println("O sexo foi errado"); 
		    	continue;
		    }
		    
		    System.out.printf("O peso ideal: %.2f. ", pesoIdeal);
		    if(peso==pesoIdeal) {
		    	System.out.println("Você está no peso ideal."); 
		     }
		    else if(peso>pesoIdeal) {
		    	System.out.println("Você está acima do peso ideal");
		    }
		    else {
		    	System.out.println("Você está abaixo do peso ideal");
		    }
		    
		    
		    
            System.out.print("Deseja continuar? (1 - sim) (2 - não)%n");
            desejaContinuar = scan.nextInt();
		} while(desejaContinuar==1);
		
		scan.close();
	}

}
