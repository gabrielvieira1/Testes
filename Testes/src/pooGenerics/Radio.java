package pooGenerics;

public class Radio {
	public static int AM = 1;
	public static int FM = 2;
	private float frequencia;
	private int volume;
	private int banda;
	public Radio(float frequencia, int volume, int banda) {
		this.frequencia = frequencia;
		this.volume = volume;
		this.banda = banda;
	}
	public static int getAM() {
		return AM;
	}
	public static void setAM(int aM) {
		AM = aM;
	}
	public static int getFM() {
		return FM;
	}
	public static void setFM(int fM) {
		FM = fM;
	}
	public float getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getBanda() {
		return banda;
	}
	public void setBanda(int banda) {
		this.banda = banda;
	}
	

}
