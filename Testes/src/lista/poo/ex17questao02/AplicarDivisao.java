package lista.poo.ex17questao02;

import java.util.Scanner;

public class AplicarDivisao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a, b;
		System.out.println("\n-> Insira o primeiro valor para a divisão: ");
		a = scan.nextDouble();
		System.out.println("\n-> Insira o segundo valor para a divisão: ");
		b = scan.nextDouble();
		System.out.println("\nO resultado da divisão é: " );
		Divisao.calcular(a, b);
	}

}
