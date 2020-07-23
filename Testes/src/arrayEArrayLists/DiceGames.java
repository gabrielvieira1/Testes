package arrayEArrayLists;

import java.security.SecureRandom;

public class DiceGames {
	
	static SecureRandom randonNumbers = new SecureRandom();
	static int[] frequency1 = new int[7];
	
	static int[][] soma = new int[7][7];
	
	public static void main(String[] args) {
		
			for (int roll = 1; roll <=36; roll++) 
			++frequency1[1 + randonNumbers.nextInt(6)];
		
		System.out.printf("%6s%4s%3s%4s%4s%4s%n", "1 ", "2 ", "3", "4", "5", "6");
		for (int i = 1; i < frequency1.length; i++) {
			sumDie();
		}
		outputArray(soma);
	}
	public static void sumDie() {
		for (int i = 1; i < frequency1.length; i++) {
			for (int j = 1; j < frequency1.length; j++) {
				int num = i + j;
				
				if (num == 2) {
					soma[i][j] = num;
				} else if (num == 3) {
					soma[i][j] = num;
				} else if (num == 4) {
					soma[i][j] = num;
				} else if (num == 5) {
					soma[i][j] = num;
				} else if (num == 6) {
					soma[i][j] = num;
				} else if (num == 7) {
					soma[i][j] = num;
				} else if (num == 8) {
					soma[i][j] = num;
				} else if (num == 9) {
					soma[i][j] = num;
				} else if (num == 10) {
					soma[i][j] = num;
				} else if (num == 11) {
					soma[i][j] = num;
				} else if (num == 12) {
					soma[i][j] = num;
				}
			}
		}
	}
	
	
	public static void outputArray(int[][] array) {
		for (int row = 1; row < array.length; row++) {
			System.out.print(row);
			for (int column = 1; column < array.length; column++) {
				System.out.printf("%4d", array[row][column]);
				if (column % 6  == 0) {
					System.out.println();
				}
			}
		}
		
	}

}
