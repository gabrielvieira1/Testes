package prova.poo.p1;

public class A {
	private int x = 10;
	public void exibir() {
		System.out.println("Valor de x antes " + x);
		class B{
			public String s = "String Interna";
			public B() {
				x = 0;
			}
		}
		B b = new B();
		System.out.println("Valor de x depois " + x);
	}

}
