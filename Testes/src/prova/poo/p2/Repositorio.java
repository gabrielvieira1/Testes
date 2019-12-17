package prova.poo.p2;

public class Repositorio <T> {
	private T objeto;
	
	public void add(T objeto){
		this.objeto = objeto;
	}
	public T getObjeto() {
		return this.objeto;
	}
	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
	
}
