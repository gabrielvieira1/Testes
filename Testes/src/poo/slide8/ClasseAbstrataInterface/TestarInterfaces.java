package poo.slide8.ClasseAbstrataInterface;

public class TestarInterfaces implements TerceiraInterface {
	public void main(String[] args) {
		imprimeA();
		imprimeB();
		imprime();
	}
	public void imprimeA() {
		System.out.println("A: " + a);
	}
	public void imprimeB() {
		System.out.println("Nome: " + nome);
	}
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}
	
}
