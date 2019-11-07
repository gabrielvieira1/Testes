package ExercicioGenerics;

public class Repositorio<T> {
	private T objeto;
	
	public void add(T objeto) {
		this.objeto = objeto;
	}
	public T getObjeto() {
		return objeto;
	}
	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
	

}
