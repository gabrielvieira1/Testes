package provapoop2.ex6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ClasseC {
	
	public static void main(String[] args) {
		//ArrayList al = new ArrayList<>();
	//	LinkedList ll = new LinkedList();
		TreeSet st = new TreeSet();
		st.add(50);
		st.add(21);
		st.add(15);
		st.add(72);
		st.add(93);
		st.add(100);
		st.add(150);
		Iterator iter3 = st.iterator();
		ImprimiGenerics impressao = new ImprimiGenerics();
	//	impressao.imprimirDados(st);
		
		while (iter3.hasNext()) {
			System.out.println(iter3.next()+" ");
			
		}
		
	}

}
