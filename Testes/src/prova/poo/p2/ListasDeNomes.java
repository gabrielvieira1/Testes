package prova.poo.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListasDeNomes {
	
	public static void main(String[] args) {
		ArrayList<String> primeiraLista = new ArrayList<String>();
		ArrayList<String> segundaLista = new ArrayList<String>();
		primeiraLista.add("Helena");
		primeiraLista.add("João");
		primeiraLista.add("Elaine");
		segundaLista.add("Jose");
		segundaLista.add("Maria");
		segundaLista.add("Pedro");
		
		Map<Integer, ArrayList> objMap = new HashMap<Integer, ArrayList>();
		objMap.put(1, primeiraLista);
		objMap.put(2, segundaLista);
		for (ArrayList listas : objMap.values()){
		System.out.println(listas);
	}
	}

/*	public static void main(String[] args) {
		ArrayList<String> primeiraLista = new ArrayList<String>();
		ArrayList<String> segundaLista = new ArrayList<String>();
		segundaLista.add("Helena");
		segundaLista.add("João");
		segundaLista.add("Elaine");
		primeiraLista.add("Jose");
		primeiraLista.add("Maria");
		primeiraLista.add("Pedro");
		
		Map<Integer, ArrayList> objMap = new HashMap<Integer, ArrayList>();
		objMap.put(1, primeiraLista);
		objMap.put(2, segundaLista);
		for (ArrayList listas : objMap.values()) {
			System.out.println(listas);
		} 
//		primeira.put(new Integer(1), "Maria");
//		Set s = primeira.entrySet();
//	Iterator it = s.iterator();
//		
//		Iterator it = primeiraLista.iterator();
//		int i = 1;
//		while (it.hasNext()) {
//			primeira.put(i, (String) it.next());
//			i++;
//		}
//		Iterator itSegunda = segundaLista.iterator();
//		int cont = 4;
//		while (itSegunda.hasNext()) {
//			primeira.put(cont, (String) itSegunda.next());
//			cont++;
//		}
	
//		for (int j = 1; j < primeiraLista.size() + segundaLista.size(); j++) {
//			if (j < 4) {
//				primeira.put(j, primeiraLista.get(cont1));
//				cont1++;
//			} else {
//				primeira.put(j, segundaLista.get(cont2));
//				cont2++;
//			}
//		}
//		System.out.println(primeiraLista.toString());
//		System.out.println(segundaLista.toString());
//		System.out.println(objMap.entrySet());
//		System.out.println(objMap.toString());
	}*/

}
