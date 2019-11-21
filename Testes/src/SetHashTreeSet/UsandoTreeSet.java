/**
 * 
 */
/**
 * @author aluno
 *
 */
package SetHashTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class UsandoTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(11);
		tree.add(11);
		tree.add(1);
		tree.add(17);
		tree.add(9);
		tree.add(10);
		Iterator<Integer> iterator = tree.iterator();
		System.out.println("Elementos do TreeSet: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		System.out.println();
		
		if (tree.isEmpty()) {
			System.out.println("TreeSet está vazia. ");
		} else {
			System.out.println("Tamanho da TreeSet: " + tree.size());
		}
		
		System.out.println("primeiro elemento: " + tree.first());
		
		System.out.println("Ultimo elemento: " + tree.last());
		
		if (tree.remove(11)) {
			System.out.println("Elemento (11) removido: ");
			
		} else {
			System.out.println("Elementoi não existe!");
		}
		
		System.out.println("Elementos atualizados: ");
		iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
		System.out.println();
		System.out.println("Novo tamanho do TreeSet: " + tree.size());
		
		tree.clear();
		if (tree.isEmpty()) {
			
			System.out.println("TreeSet está vazio ");
			
		} else {
			System.out.println("Tamanho final do TreeSet: " + tree.size());
		}
		
	}
}