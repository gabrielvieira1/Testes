package SetHashTreeSet;

public class Arvore implements Comparable<Arvore>{

	int altura;
	
	public Arvore(int alt) {
		altura = alt;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String toString() {
		
		return altura + "";
	}

	@Override
	public int compareTo(Arvore a) {
		return a.altura;
	}
	

}
