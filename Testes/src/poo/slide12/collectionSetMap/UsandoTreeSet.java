package poo.slide12.collectionSetMap;

import java.util.TreeSet;
import java.util.Iterator;

public class UsandoTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(11);
		tree.add(1);
		tree.add(17);
		tree.add(9);
		tree.add(10);
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Elementos do treeSet: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		
		if (tree.isEmpty()) {
			System.out.print("TreeSet está vazio. ");
		} else {
			System.out.println("Tamanho do TreeSet: " + tree.size());
		}
		
		System.out.println("primeiro elemento: " + tree.first());
		
		System.out.println("ultimo elemento: " + tree.last());
		
		if (tree.remove(11)) {
			System.out.println("Elemento (11) removido");
		} else {
			System.out.println("Elemento não existe!");
		}
		
		System.out.println("Elementos atualizados: ");
		iterator = tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("Novo tamanho do TreeSet: " + tree.size());
		
		tree.clear();
		if (tree.isEmpty()) {
			System.out.println("TreeSet está vazio. ");
		} else {
			System.out.println("Tamanho final do TreeSet: " + tree.size());
		}
	}

}
