package poo.slide8.ClasseAbstrataInterface;

public abstract class Figura {
	protected int x, y;
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract public void desenha();
}
