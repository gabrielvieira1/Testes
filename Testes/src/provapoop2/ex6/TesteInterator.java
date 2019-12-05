package provapoop2.ex6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteInterator {
	public static void main(String args[]) {
		Set<String> cargos = new HashSet<>();
		try {
			System.out.println("entrou try");
			cargos.add("Gerente");
			cargos.add("Telefonista");
			cargos.add("Diretor");
			cargos.add("Gerente"); // repetido
			cargos.add("Administrador");
			cargos.add("Secretária");
		} catch (Exception e) {
			System.out.println("entrou cath 1");
			cargos.add("Professor");
		} finally {
			System.out.println("entrou finaly");
			cargos.add("Diretor");
		}
		System.out.println("entrou ordem");
		cargos.add("Contador");
		cargos.add("Operador");
		cargos.add("Encanador");
		Set<String> cargos1 = new TreeSet<>(); // não permite repetidos
		cargos1.addAll(cargos);
		cargos.add("Motorista"); // acredito q n entra
		cargos1.add("Estagiário");
		Iterator<String> it = cargos1.iterator(); //embaralha
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}