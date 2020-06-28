package Lista18Queue;

public class Carro extends Veiculo{
	private int cv;
	
	
	public Carro(String fabricante, String modelo, int cv) {
		super(fabricante, modelo);
		this.cv = cv;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}
	
	public String toString() {
        return "Fabricante: " + getFabricante() + " | " + "Modelo:" 
	+ " | " + getModelo() + " | " + "CC" + getCv();
    }

}
