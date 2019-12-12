package provapoop2.ex6;

import java.util.Arrays;
import java.util.LinkedList;

public class Principal {
	public static void main(String[] args) {
		String[] insetos = {"zangão" , "formiga", "barata"};
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(insetos));
		links.add(2,"libelula");
		links.addLast("mosca");	
		links.add(2, "gafanhoto"); 
		links.addFirst("besouro"); 
		links.add("abelha"); 
		links.add(4, "vespa");
		insetos = links.toArray(new String[links.size()]);
		
		System.out.println("insetos: ");
		
		for (String inseto : insetos) {
			System.out.print(inseto + " ");
		}
	}
}
