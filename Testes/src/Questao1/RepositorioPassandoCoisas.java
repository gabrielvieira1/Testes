package Questao1;

public class RepositorioPassandoCoisas {
	public static void main(String [] args) {
		Repositorio<String> RepositorioString = new Repositorio<String>();
		RepositorioString.add("Jos� da Silva");
		
		Repositorio<Integer> RepositorioInteger = new Repositorio<Integer>();
		RepositorioInteger.add(new Integer(20));
		
		System.out.println(RepositorioString.get());
		System.out.println(RepositorioInteger.get());
	}
	
}
