package provapoop2.ex6;

import java.util.Arrays;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		String[] insetos = {"zangão" , "formiga", "barata"};
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(insetos));
		links.add(2,"libelula"); // adiciona na 2 posicao
		links.addLast("mosca");	// adiciona na ultima antes do ultimo elemento a ser adicionado
		links.add(2, "gafanhoto"); // adiciona na 2 posicao
		links.addFirst("besouro"); // adiciona na 1 posicao
		links.add("abelha"); // ultimo elemento a ser adicionado
		links.add(4, "vespa"); // adiciona na ultima posicao
		System.out.print("links " + links);
		insetos = links.toArray(new String[links.size()]);
		
		System.out.println("insetos: ");
		
		for (String inseto : insetos) {
		//	System.out.print(links+ " ");
			System.out.print(inseto + " ");
			
		}
		
	}

}
