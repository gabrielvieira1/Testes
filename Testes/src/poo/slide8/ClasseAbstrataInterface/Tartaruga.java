package poo.slide8.ClasseAbstrataInterface;

public class Tartaruga implements Anda {
	private int posx, posy;
	
	public void avancar(int deslx, int desly) {
		posx += deslx;
		posy += desly;
	}
	public void recuar(int deslx, int desly) {
		posx -= deslx;
		posy -= desly;
	}
}
