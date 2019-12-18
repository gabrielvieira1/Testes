package poo.slide6.polimorfismo;

public class GerenteTeste {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("José", 80000);
		gerente.setBonus(5000);
		Empregado[] pessoal = new Empregado[3];
		pessoal[0] = gerente;
		pessoal[1] = new Empregado("Maria", 5000);
		pessoal[2] = new Empregado("João", 4500);
		for(Empregado e : pessoal) {
			System.out.println("Nome: " + e.getNome()
			+ " , salário: " + e.getSalario());
		}
	}

}
