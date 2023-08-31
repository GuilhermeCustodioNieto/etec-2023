package estudosCaso;

public class altura {

	public static void main(String[] args) {
		double joao = 1.340, pedro = 1.450;
		int anos = 0;
		
		while (joao <= pedro) {
			joao += 0.025;
			pedro += 0.02;
			anos++;
			
		}
		
		System.out.println(anos);
	}

}