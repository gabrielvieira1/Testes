package provapoop2.ex6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ClasseB {
	
	public static void main(String[] args) {
		//ArrayList al = new ArrayList<>();
		LinkedList ll = new LinkedList();
		ll.add(50);
		ll.add(21);
		ll.add(15);
		ll.add(72);
		ll.add(93);
		ll.add(100);
		ll.add(150);
		Iterator iter2 = ll.iterator();
		ImprimiGenerics impressao = new ImprimiGenerics();
		impressao.imprimirDados(ll);
//		while (iter2.hasNext()) {
//			System.out.println(iter2.next()+" ");
//			
//		}
		
	}

}
