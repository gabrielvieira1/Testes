package poo.slide8.ClasseAbstrataInterface;

public class Principal extends Ab1 {
	int x;
	Principal(){
		System.out.println(super.x);
	}
	public void metodo1() {
		this.x = super.x;
	}
	public void metodo1(float s) {
		System.out.println(s);
	}
	public void Ab1() {
	}
	public static void main(String[] args) {
		Principal p = new Principal();
		System.out.println(p.x);
		p.x = 2;
		System.out.println(p.x);
		p.metodo1();
		System.out.println(p.x);
	}
}
