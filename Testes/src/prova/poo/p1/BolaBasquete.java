package prova.poo.p1;

public class BolaBasquete extends Bola{
	public void corPadrao() {
		System.out.println("Amarela ");
	}
	public void corEnviada(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Verde ");
		}
	}
}
