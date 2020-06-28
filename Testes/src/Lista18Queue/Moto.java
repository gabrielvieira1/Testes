package Lista18Queue;

public class Moto extends Veiculo{
	private int cc;


	public Moto(String fabricante, String modelo, int cc) {
		super(fabricante, modelo);
		this.cc = cc;
	}


	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String toString() {
        return "Fabricante: " + getFabricante() + " | " + "Modelo:" + " | " + 
	getModelo() + " | " + "CC" + getCc();
    }
	
}
