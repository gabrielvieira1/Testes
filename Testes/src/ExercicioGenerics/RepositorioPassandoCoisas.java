package ExercicioGenerics;

public class RepositorioPassandoCoisas {
	public static void main(String[] args) {
		Repositorio<String> coisa1 = new Repositorio<String>();
		coisa1.add("José da Silva");
		
		Repositorio<Integer> coisa2 = new Repositorio<Integer>();
		coisa2.add(20);
		
		System.out.println(coisa1.getObjeto());
		System.out.println(coisa2.getObjeto());
		
		
	}
}
