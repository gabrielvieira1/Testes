package ArrayEArrayLists;

public class InitArray {

	public static void main(String[] args) {
		// declara array variável e o inicializa com um objeto array
	//	int[] array = new int[10]; // cria o objeto array
		
		// A lista de inicializador especifica o valor inicial de cada elemento
	//	int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		final int ARRAY_LENGTH = 10; // declara constante
		int[] array = new int[ARRAY_LENGTH]; // cria o array
		
		// calcula valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			array[counter] = 2 + 2 * counter;
		
		
		System.out.printf("%s%8s%n", "Index", "Value"); //título de coluna
		
		// gera saída do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}

}
