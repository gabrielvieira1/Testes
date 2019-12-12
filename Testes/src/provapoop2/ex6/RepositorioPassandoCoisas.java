package provapoop2.ex6;

public class RepositorioPassandoCoisas {

	public static void main(String[] args) {
		Repositorio<String> nome = new Repositorio<String>();
		nome.add("José da Silva");
		
		Repositorio<Integer> num = new Repositorio<Integer>();
		num.add(20);
		
		System.out.println(nome.getObjeto());
		System.out.println(num.getObjeto());
	}

}
