package geracaodeNumerosAleatorios;

import java.security.SecureRandom;

public class Sorteio {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0; //truque de mestre
		int frequency2 = 0; //ultimato
		int frequency3 = 0; //guardioes da gaaxia 2
		int frequency4 = 0; //pantera
		int frequency5 = 0; //dope
		int frequency6 = 0; //super bad
		
		int face = 0;
		
		
		for(int roll = 1; roll<=6000000; roll++) {
		 // int number = valorDeDeslocamento + randomNumbers.nextInt( fatorDeEscalonamento );
			face = 1 + randomNumbers.nextInt(6);
			//System.out.println(face);
			
			
			switch(face) 
			{
			case 1:
				++frequency1;
				break;
			case 2:
				++frequency2;
				break;
			case 3:
				++frequency3;
				break;
			case 4:
				++frequency4;
				break;
			case 5:
				++frequency5;
				break;
			case 6:
				++frequency6;
				break;
			}
		}
		System.out.println(face);
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
	}

}
