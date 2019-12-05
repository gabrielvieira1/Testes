package provapoop2.ex6;

public class PrincipalException {

	public static void main(String[] args) {
		System.out.println("Iniciando main...");
		metodo1();
		System.out.println("Fianlizando main...");
	}

	static void metodo1() {
		System.out.println("Iniciando metodo1...");
		metodo2();
		System.out.println("Finanlizando metodo1...");
	}

	static void metodo2() throws ArrayIndexOutOfBoundsException {
		System.out.println("Iniciando metodo2...");
		try {
			int[] num = new int[10];
			for (int i = 0; i <= 15; i++) {
				num[i] = i;
				System.out.println(i);
			}
		} catch (Exception e) {
		System.out.println("Erro array: " + e);
		}
		System.out.println("Finanlizando metodo2...");
		
	}

}
