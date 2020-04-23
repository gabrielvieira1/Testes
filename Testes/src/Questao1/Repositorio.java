package Questao1;

public class Repositorio <T> {
	private T objeto;

	public void add (T elemento) {
		this.objeto = elemento;
	}
	
	public T get() {
		return objeto;
	}

}