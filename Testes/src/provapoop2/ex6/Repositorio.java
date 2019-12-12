package provapoop2.ex6;

public class Repositorio<T> {
	T objeto;
	public void add(T elemento) {
		this.objeto = elemento;
	}
	
	public T getObjeto() {
		return objeto;
	}

}
