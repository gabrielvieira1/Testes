package poo.slide5.heranca;

public class TV extends Eletrodomestico{
	private int canal;
	private int volume;
	private int tamanho;
	public TV(int voltagem, int consumo, int canal, int volume, int tamanho) {
		super(false, voltagem, consumo);
		this.canal = canal;
		this.volume = volume;
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
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	

}
