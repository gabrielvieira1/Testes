package lista.poo.ex2;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calculaArea() {
		double area;
		area = (getAltura() * getLargura());
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro;
		perimetro = ((getAltura() * 2) + (getLargura() * 2));
		return perimetro;
	}
	
}
