package EscopoApresentacao;

import java.util.Scanner;

import EscopoEntidades.Aluno;

public class AlunoApresentacao {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public Aluno preencherAluno() {
		
		System.out.println("================= Digite seu nome: =================");
		String nome = scanner.nextLine();
		
		System.out.println("================= Digite seu CPF: =================");
		String cpf = scanner.nextLine();
		
		return new Aluno(nome, cpf);

	}

}
