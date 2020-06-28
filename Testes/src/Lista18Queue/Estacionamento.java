package Lista18Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Questao2.UtilEmpregado;
	
	
public class Estacionamento {
	
	static Queue<Veiculo> veiculos = new LinkedList<>();
	
	public static void main(String[] args) {
		Moto moto1 = new Moto("Honda", "CBR 600RR", 599);
		Moto moto2 = new Moto("Yamaha", "MT-09", 897);
		Moto moto3 = new Moto("Suzuki", "GSX-R1000", 998);
		Carro carro1 = new Carro("Volkswagem", "Jetta GLI 350 TSI", 230);
		Carro carro2 = new Carro("Toyota", "Corolla GLI 2.0L", 177);
		Carro carro3 = new Carro("Ford", "Focus Tittanium Plus 2.0 AT", 178);
		veiculos.add(moto1);
		veiculos.add(moto2);
		veiculos.add(moto3);
		veiculos.add(carro1);
		veiculos.add(carro2);
		veiculos.add(carro3);
		
		System.out.println(veiculos.size());
		if (veiculos.peek().getModelo() == "CBR 600RR") {
			System.out.println(veiculos.peek());
		} else {
			System.out.println("Veículo não correspondete à " + "CBR 600RR");
		}
		while (veiculos.size() > 0) {
			Veiculo vec = veiculos.poll();
			if (vec instanceof Moto) {
				System.out.println("MOTO: "+ vec);
			} else {
				System.out.println("CARRO: "+vec);
			}
		}

		System.out.println(veiculos.size());
		
	}
	
	

}
