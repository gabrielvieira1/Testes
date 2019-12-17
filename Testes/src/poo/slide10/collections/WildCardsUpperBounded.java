package poo.slide10.collections;

import java.util.List;
import java.util.ArrayList;

public class WildCardsUpperBounded {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		double resultSoma = soma(ints);
		System.out.println("A soma é = " + resultSoma);
	}
	public static double soma(List<? extends Number> list) {
		double soma =0;
		for(Number n : list) {
			soma+= n.doubleValue();
		}
		return soma;
	}
	
	public static void imprimirDados(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj + " - ");
		}
	}

}
