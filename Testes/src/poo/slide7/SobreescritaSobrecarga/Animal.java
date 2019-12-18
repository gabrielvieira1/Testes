package poo.slide7.SobreescritaSobrecarga;

public class Animal {
	
	public static void main(String[] args) {
		new Dog().comer();
		new Dog().comer(2, "a");
		new Dog().comer(2, 3);
		new Dog().teste(new Dog());
		new Dog().teste(new Animal());
	}
	
	void comer() {
		System.out.println("Animal comendo...");
	}
	public void comer(int x, String s) {
		System.out.println("Animal comendo...");
	}
	
	void teste(Animal a) {
		System.out.println("Animal");
	}
}
