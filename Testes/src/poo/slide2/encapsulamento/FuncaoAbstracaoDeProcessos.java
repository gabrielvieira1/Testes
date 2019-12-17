package poo.slide2.encapsulamento;

public class FuncaoAbstracaoDeProcessos {

	public static void main(String[] args) {
		System.out.println(soma(2, 3));
	}
	public static int soma(int x, int y) {
		int a=x, b=y, c;
		c = a + b;
		return c;
	}
}
