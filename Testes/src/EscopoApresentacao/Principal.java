package EscopoApresentacao;
import java.io.IOException;

import EscopoEntidades.Aluno;
import EscopoNegocio.AlunoNegocio;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		AlunoNegocio alunoNegocio = new AlunoNegocio();
		AlunoApresentacao alunoApresentacao = new AlunoApresentacao();
			
		Aluno aluno = alunoApresentacao.preencherAluno();
		String mensagem = alunoNegocio.cadastrarAluno(aluno);
		
		System.out.println(mensagem);
		
	}
	
	
}
