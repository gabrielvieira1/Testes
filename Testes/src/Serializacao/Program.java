package Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Tenis[] arrayTenis = new Tenis[3];

		Tenis tenis1 = new Tenis("Adidas", "bolts", 44);
		Tenis tenis2 = new Tenis("AllStar", "allstart", 44);
		Tenis tenis3 = new Tenis("Nike", "corrida", 44);

		arrayTenis[0] = tenis1;
		arrayTenis[1] = tenis2;
		arrayTenis[2] = tenis3;
		
		serializaListaTenis(arrayTenis);
		desserializaListaTenis();


		sc.close();
	}

	public static void serializaListaTenis(Tenis[] tenis) {
		
		try {
			ObjectOutputStream oS = new ObjectOutputStream(
					new FileOutputStream("src/Serializacao/Tenis.txt"));
			oS.writeObject(tenis);
			oS.close();
			System.out.println("Dados salvo com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void desserializaListaTenis() throws IOException {
		Tenis[] arrayTenis = new Tenis[3];
		try {
			FileInputStream fileIn = new FileInputStream("src/Serializacao/Tenis.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			arrayTenis = (Tenis[]) in.readObject();
			System.out.println("Dados do Tenis:");
			for (int i = 0; i < arrayTenis.length; i++) {
				System.out.println(arrayTenis[i].toString());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
