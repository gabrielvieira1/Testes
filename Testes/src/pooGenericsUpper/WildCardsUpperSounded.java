package pooGenericsUpper;

import java.util.ArrayList;
import java.util.List;

public class WildCardsUpperSounded {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double resultSoma = soma(ints);
		System.out.println("A soma é =" + resultSoma);
	}
	
	public static double soma(List<? extends Number> list) {
		double soma = 0;
		for(Number n : list) {
			soma += n.doubleValue();
		}
		return soma;
	}
	
	public static void imprimirDados(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj + "-");
		}
	}
	
	public static void addInteiros(List<? super Integer> list) {
		list.add(new Integer(50));
	}
	
}
