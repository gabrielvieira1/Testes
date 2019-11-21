package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsandoHashSet {

	public static void main(String[] args) {
		Set<Pessoa> pessoa;
		pessoa = new HashSet<Pessoa>();
		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setNome("Paulo");
		p1.setSexo("M");
		pessoa.add(p1);
		p1.setId(10);
		pessoa.add(p1);
		Iterator<Pessoa> pessoaIterator = pessoa.iterator();
		while (pessoaIterator.hasNext()) {
			System.out.println(pessoaIterator.next().toString());
		}
		
		
	}

}
