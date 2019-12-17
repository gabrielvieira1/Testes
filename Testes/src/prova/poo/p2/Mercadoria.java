package prova.poo.p2;

public class Mercadoria implements Comparable<Mercadoria> {
	int tamanho;
	
	public Mercadoria(int tamanho) {
		this.tamanho = tamanho;
	}
	public int compareTo(Mercadoria m) {
		return m.tamanho;
	}
	

}
