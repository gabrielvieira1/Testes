package poo.slide12.collectionSetMap;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class UsandoHashSet {

	public static void main(String[] args) {
		Set<Pessoa> pessoa;
		pessoa = new  HashSet<Pessoa>();
		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setNome("Gabriel");
		p1.setSexo("M");
		pessoa.add(p1);
		Iterator<Pessoa> pessoaIterator = pessoa.iterator();
		while(pessoaIterator.hasNext()) {
			System.out.println(pessoaIterator.next().toString());
		}
	}

}
