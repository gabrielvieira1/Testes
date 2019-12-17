package prova.poo.p1;

public class Usado extends Imovel{
	private double desconto;
	
	public Usado(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
