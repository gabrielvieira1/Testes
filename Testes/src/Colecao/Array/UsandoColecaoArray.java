package Colecao.Array;

import java.util.Arrays;

public class UsandoColecaoArray {
	private int intArray[] = {1, 2, 3, 4, 5, 6};
	private double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4};
	private int filledIntArray[], intArrayCopy[];
	
	public UsandoColecaoArray() { // Construtor array... Inicializando
		filledIntArray = new int[10]; // Cria array de int com 10 lementos
		intArrayCopy = new int[intArray.length]; // cria array de int com o tamanho do intArray
		
		Arrays.fill(filledIntArray, 7); // Metodo para preencher todos os elementos com 7s
		Arrays.sort(doubleArray); //Metodo para classificar o array doubleArray ascendente
		// copia array intArray no array intArrayCopy
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
	}
	
	public void printArray() {
		System.out.print("doubleArray: ");
		for (double doubleValue : doubleArray)
			System.out.printf("%.1f ", doubleValue);
		
		System.out.print("\nintArray: ");
		for(int intValue : intArray)
			System.out.printf("%d ", intValue);
		
		System.out.print("\nfilledIntArray: ");
		for(int intValue : filledIntArray)
			System.out.printf("%d ", intValue);
		
		System.out.print("\nintArrayCopy: ");
		for(int intValue : intArrayCopy)
			System.out.printf("%d ", intValue);
		System.out.println("\n");
	}
	
	public int searchForInt(int value) {
		return Arrays.binarySearch(intArray, value);
	}
	
	public void printEquality() {
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("intArray %s intArrayCopy\n", (b ? "==" : "!="));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray\n", (b? "==" : "!="));
	}
	
	
	public static void main(String[] args) {
		UsandoColecaoArray usandoColecaoArray = new UsandoColecaoArray();
		usandoColecaoArray.printArray();
		usandoColecaoArray.printEquality();
		
		int local = usandoColecaoArray.searchForInt(5);
		if (local >= 0) {
			System.out.printf("Found 5 at element %d in intArray\n", local);
		} else {
			System.out.println("5 not found in intArray");
		}
		local = usandoColecaoArray.searchForInt(8763);
		if (local >= 0) {
			System.out.printf("Found 8763 at element %d in intArray\n", local);
		} else {
			System.out.println("8763 not found in intArray");
		}
	}

}
