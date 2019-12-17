package poo.slide10.collections;
import java.util.List;
public class ExemploWildcards {
	public static double soma(List<Number> list) {
		double soma = 0;
		for(Number n : list) {
			soma += n.doubleValue();
		}
		return soma;
	}
	
}
