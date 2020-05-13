package Serialização;

import java.io.Serializable;

public class Tenis implements Serializable{
	
	private String marca;
	private String modelo;
	private int tamanho;
	
	public Tenis(String marca, String modelo, int tamanho) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Marca: " 
		+ getMarca() 
		+ " Modelo: " 
		+ getModelo() 
		+ " Tamanho: " 
		+ getTamanho();
	}
	
	

}
