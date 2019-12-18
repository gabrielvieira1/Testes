package poo.slide7.SobreescritaSobrecarga;

public class Dog extends Animal {

		void rolar() {
			System.out.println("Dog rolando...");
		}
		
		void comer() {
			System.out.println("Dog comendo...");
		}
		
		protected void comer(int x, float s) {
			System.out.println("Dog comendo...");
		}
		
		void teste(Dog d) {
			System.out.println("Dog");
		}
	
}
