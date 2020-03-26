package exercicio;

public class MedicaoTempo {
	public static void main(String[] args) {
		
		long TI = System.currentTimeMillis();
		
		for (int i = 0; i <= 100000; i++) {
			System.out.print(".");
			if (i%100 == 0) {
				System.out.println();
			}
		}
		
		long TF = System.currentTimeMillis();
		
		System.out.println("Tempo de execução: " + (TF-TI) + " milisegundos");
	}
}
