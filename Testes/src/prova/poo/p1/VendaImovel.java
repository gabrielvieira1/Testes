package prova.poo.p1;

import java.util.Scanner;

public class VendaImovel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		System.out.println("Escolha 1 para novo 2 para Usado:");
		opcao =scan.nextInt();
		
		if (opcao == 1) {
			Novo novo = new Novo("Rua nova", 12.50 , 5);
			System.out.printf("%s %s %.2f %s %.2f", "Endereço: " + novo.getEndereco(), "Valor R$" , novo.getPreco(), "Valor com adicional R$", (novo.getPreco() + novo.getPrecoAdicional()));
		} else {
			Usado usado = new Usado("Rua velha", 10, 2);
			System.out.printf("%s %s %.2f %s %.2f", "Endereço: " + usado.getEndereco(), "Valor R$" , usado.getPreco(), "Valor com desconto R$" , (usado.getPreco() - usado.getDesconto()));
		}
	}

}
