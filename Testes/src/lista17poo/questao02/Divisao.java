package lista17poo.questao02;

import java.util.Scanner;

public class Divisao {

	static Scanner scan = new Scanner(System.in);

	public static void calcular(double a, double b) {
		try {
			double valor = a / b;
			System.out.println(valor);
		} catch (ArithmeticException e1) {
			System.out.println("-> Erro ao dividir por zero!");
		}
	}
}