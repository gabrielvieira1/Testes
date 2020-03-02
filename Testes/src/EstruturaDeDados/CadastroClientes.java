package EstruturaDeDados;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class CadastroClientes {

	static Cliente[] cliente = new Cliente[1];
	static Scanner sc = new Scanner(System.in);
	static int cont;
	static int tamanho;

	CadastroClientes() {
		cont = 0;
		tamanho = 1;
	}

	public static void main(String[] args) {

		System.out.println("Cadastro de clientes");
		char resposta;
		do {
			int posicao = 0;
			System.out.print("Enter name: ");
			String nome = sc.next();
			System.out.print("Enter cpf: ");
			String cpf = sc.next();
			System.out.print("Enter fone: ");
			String fone = sc.next();
			System.out.print("Enter email: ");
			String email = sc.next();
			add(nome, cpf, fone, email);
			posicao++;

			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		System.out.println("Imprimir tudo");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(cliente[i] + " ");
		}

		System.out.println("Tamanho atual " + cliente.length);

	}

	static void aumentarArray() {

		Cliente arrayTemp[] = null;
		if (cont == tamanho) {
			arrayTemp = new Cliente[tamanho + 1];
			for (int i = 0; i < tamanho; i++) {
				arrayTemp[i] = cliente[i];
			}
		}

		cliente = arrayTemp;
		tamanho = tamanho + 1;
	}

	static void add(String nome, String cpf, String fone, String email) {

		if (cont == tamanho) {
			aumentarArray();
		}

		cliente[cont] = new Cliente(nome, cpf, fone, email);
		cont++;
	}

}
