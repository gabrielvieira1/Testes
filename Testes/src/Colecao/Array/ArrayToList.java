package Colecao.Array;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayToList {
	public static void main(String[] args) {
		String[] cores = { "vermelha", "azul", "amarelo" };
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(cores));
		links.addLast("preta");
		links.add("violeta");
		links.add(3, "verde"); // Add na terceira posição
		links.addFirst("azul claro"); // Add na primeira posição
		cores = links.toArray(new String[links.size()]);
		System.out.println("Cores: ");
		for (String cor : cores)
			System.out.println(cor);
	}
}
