package EscopoNegocio;
import java.io.IOException;

import EscopoDados.AlunoDados;
import EscopoEntidades.Aluno;

public class AlunoNegocio {

	private AlunoDados alunoDados = new AlunoDados();

	public String cadastrarAluno(Aluno aluno) throws ClassNotFoundException, IOException {
		
		if (this.alunoDados.consultaAluno(aluno.getCpf()) != null) {
			return "\nErro: O aluno já foi cadastrado!";
			// Crie suas mensagens personalizadas.
		}
		
		alunoDados.cadastrar(aluno);
		return "\nAluno cadastrado com sucesso!";
		
	}
	
	public void matricularAluno(Aluno aluno) throws Exception {
		// Validar se aluno está ativo
		// Validar se há vaga no curso
		// ...
	}
	
	
}
