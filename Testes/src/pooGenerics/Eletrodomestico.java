package pooGenerics;

public class Eletrodomestico<T> {
	T objeto;
	public Eletrodomestico(T objeto) {
		this.objeto = objeto;
	}
	public T getObjeto() {
		return objeto;
	}
	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
}
