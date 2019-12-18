package poo.slide6.polimorfismo;

public class Gerente extends Empregado {
	private double bonus;
	public Gerente(String n, double s) {
		super(n,s);
		bonus = 0;
	}
	public double getSalario() {
		double salarioBase =super.getSalario();
		return salarioBase + bonus;
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
}
