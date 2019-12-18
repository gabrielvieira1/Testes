package poo.slide8.ClasseAbstrataInterface;

public class BemTeVi implements Anda, Voa {
	private int posx, posy;
	private int altura;
	public void avancar(int deslx, int desly) {
		posx += deslx;
		posy += desly;
	}
	public void recuar(int deslx, int desly) {
		posx -= deslx;
		posy -= desly;
	}
	public void subir(int desl_alt) {
		altura += desl_alt;
	}
	public void descer(int desl_alt) {
		altura -= desl_alt;
	}
}
