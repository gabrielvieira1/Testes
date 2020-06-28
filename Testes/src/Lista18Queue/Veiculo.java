package Lista18Queue;

import java.util.List;

import Questao2.UtilEmpregado;

public class Veiculo<T> {
	private String fabricante;
	private String modelo;
	
	public Veiculo(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
