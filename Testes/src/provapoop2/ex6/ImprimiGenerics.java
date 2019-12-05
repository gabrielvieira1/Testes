package provapoop2.ex6;

import java.util.List;
import java.util.Set;

public class ImprimiGenerics {

	public static void imprimirDados(List<?> objetos) {
		for (Object obj : objetos) {
			System.out.println(obj + " ");
		}
	}
	
	public static void imprimirDados(Set<?> objetos) {
		for (Object obj : objetos) {
			System.out.println(obj + " ");
		}
	}
}
