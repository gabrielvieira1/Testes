package poo.slide5.heranca;

public class HerancaTeste {
	
	public static void mostrarCaracteristicas(TV obj) {
		System.out.println("Esta TV tem as seguintes caracter�sticas:\n"
				+ "Tamanho: " + obj.getTamanho() + "\"\n" 
				+ "Voltagem Atual: " + obj.getVoltagem() + "V\n" 
				+ "Consumo: " + obj.getConsumo() + "W\n");
		if (obj.getLigado()) {
			System.out.println("Ligado Sim\n" + "Canal: " + obj.getCanal() + "\n"
					+ "Volume: " + obj.getVolume() + "\n");
			} else {
				System.out.println("Ligado: N�o\n");
			}
		
	}

	public static void main(String[] args) {
		TV tv1 = new TV(110, 95, 0, 0, 21);
		TV tv2 = new TV(220, 127, 0, 0, 29);
		tv2.setLigado(true);
		tv2.setCanal(3);
		tv2.setVolume(25);
		mostrarCaracteristicas(tv1);
		mostrarCaracteristicas(tv2);
	}

}
