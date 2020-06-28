package EscopoDados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import EscopoEntidades.Aluno;

public class AlunoDados {
	
	// Este � apenas um esbo�o do m�todo, voc� deve modulariz�-lo para reusar trechos repetitivos de c�digo o m�ximo que puder.
	public void cadastrar(Aluno aluno) throws IOException, ClassNotFoundException {

		File arquivo = new File("arquivos/alunos.txt");
		Aluno[] colecaoAlunos;
		
		if (arquivo.exists()) {
			
			// PASSOS para ler os alunos j� existentes no arquivo 
			
			// Passo 1 - Crie um objeto FileInputStream
			FileInputStream fis = new FileInputStream(arquivo);
			
			// Passo 2 - Crie um objeto ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream (fis);
			
			// Passo 3 - Recupere todos os alunos j� gravados no arquivo
			colecaoAlunos = (Aluno[]) ois.readObject();
			
			// Passo 4 - Feche o ObjectInputStream
			ois.close();
			
		} else {
			
			arquivo.createNewFile();
			colecaoAlunos = new Aluno[1];
			
		}
		
		// Voc� deve adicionar o novo aluno � cole��o
		colecaoAlunos[colecaoAlunos.length-1] = aluno;
		
		// Voc� deve aumentar o tamanho do array para o cadastro do pr�ximo aluno
		Aluno[] alunosNovoArray = new Aluno[colecaoAlunos.length + 1];
		
		System.arraycopy(colecaoAlunos, 0, alunosNovoArray, 0, colecaoAlunos.length);
		colecaoAlunos = alunosNovoArray;
		
		for(int i=0; i<colecaoAlunos.length-1; i++) {
			System.out.println(colecaoAlunos[i]);
		}
		
		// PASSOS para salvar o arquivo com o novo aluno j� adicionado
		
		// Passo 1 - Crie um objeto FileOutputStream
		FileOutputStream fos = new FileOutputStream(arquivo);

		// Passo 2 - Crie um objeto ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);  
				
		// Passo 3 - Grave os objetos
		oos.writeObject(colecaoAlunos);
			
		// Passo 4 - Feche o ObjectOutputStream
		oos.close();
		
	}
	
	public Aluno consultaAluno(String cpf) {
		
		// Busca todos os alunos do arquivo e faz um for para verificar se o cpf j� foi cadastrado.
		
		return null;
		
	}

}
