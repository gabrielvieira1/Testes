package poo.slide6.polimorfismo;

public class Empregado {
	private String nome;
	private double salario;
	public Empregado(String n, double s) {
		nome = n;
		salario = s;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void atualizaSalario(double percentual) {
		double atualizacao = (salario * percentual) /100;
		salario += atualizacao;
	}

}
