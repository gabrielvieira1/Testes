package pooGenerics;

public class TV {
	int tamanho;
	int canal;
	int volume;
	boolean ligada;
	public TV(int tamanho, int canal, int volume, boolean ligada) {
		this.tamanho = tamanho;
		this.canal = canal;
		this.volume = volume;
		this.ligada = ligada;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	

}
