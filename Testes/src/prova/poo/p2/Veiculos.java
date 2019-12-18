package prova.poo.p2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Veiculos {
	static Map<Object, String> veiculos;
	
	public static void main(String[] args) {
		veiculos = new HashMap<Object, String>();
		veiculos.put(2, "Uno");
		veiculos.put(1, "Up");
		veiculos.put(3, "Onix");
		veiculos.put(5, "ka");
		veiculos.put(4, "HB20");
		veiculos.put(7, "Celta");
		veiculos.put(6, "Gol");
		System.out.println("Listagem Simples de Veiculos:");
		listaVeiculosSimples();
		System.out.println("\n");
		System.out.println("Listagem Sofisticada de Veiculos:");
		listaVeiculosSofisticados();
	}
	
	public static void listaVeiculosSimples() {
		Set s = veiculos.entrySet();
		System.out.println(s);
	}
	
	public static void listaVeiculosSofisticados() {
		
		for(Map.Entry<Object, String> obj : veiculos.entrySet()) {
			System.out.println("Key :" + obj.getKey() + " Value: " + obj.getValue());
		}
	/*	Set s = veiculos.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry m =(Map.Entry) it.next();
			int key = (Integer) m.getKey();
			String value = (String) m.getValue();
			System.out.println("key :" + key + " Value :" + value);
		}*/
		
	}

}
