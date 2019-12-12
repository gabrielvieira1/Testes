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

	static void metodo2() throws ArrayIndexOutOfBoundsException { // Aqui adiciona a Exececao que ele diz no corpo da pergunta
		System.out.println("Iniciando metodo2...");
		try { //aqui tu vai tentar executar com o try
			int[] num = new int[10];
			for (int i = 0; i <= 15; i++) {
				num[i] = i;
				System.out.println(i);
			}
			
			// se der erro aqui em cima 
		} catch (Exception e) { // O catch vai pegar o erro e tratar 
			// depois de tratar o erro vai seguir a compilação do codigo
		System.out.println("Erro array: " + e);
		}
		// fim
		System.out.println("Finanlizando metodo2...");
	}

}
