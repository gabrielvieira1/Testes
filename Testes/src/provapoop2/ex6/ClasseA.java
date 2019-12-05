package provapoop2.ex6;

import java.util.ArrayList;
import java.util.Iterator;

public class ClasseA {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(21);
		al.add(15);
		al.add(72);
		al.add(93);
		al.add(100);
		al.add(150);
		Iterator iter1 = al.iterator();
		ImprimiGenerics impressao = new ImprimiGenerics();
		impressao.imprimirDados(al);
		
//		while (iter1.hasNext()) {
//			System.out.println(iter1.next()+" ");
//		}
		
	}

}
