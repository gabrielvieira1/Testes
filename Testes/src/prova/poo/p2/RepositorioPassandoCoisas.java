package prova.poo.p2;

public class RepositorioPassandoCoisas {
	public static void main(String[] args) {
		Repositorio<String> nome = new Repositorio<String>();
		Repositorio<Integer> num = new Repositorio<Integer>();
		nome.add("José da Silva");
		num.add(new Integer(20));
		
		System.out.println(nome.getObjeto() + " " + num.getObjeto());
	}

}
