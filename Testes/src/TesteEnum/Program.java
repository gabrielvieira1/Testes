package TesteEnum;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		(1) - Somar
		(2) - Subtrair
		(3) - dividir
		(4) - Multiplicar
		(5) - Calcular nota
		*/
		System.out.println("Digite a opção de menu");
		int opcao = sc.nextInt();
		
		if (opcao == EnumTeste.SOMAR.getValor()) {
			System.out.println("Entrou no if");
		}
		
		sc.close();
		
		
	}

}
