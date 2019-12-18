package lista.poo.ex17questao01;
import java.util.Scanner;

public class CadastroContas {

	public static void main(String[] args) throws ExcecaoCadastroCheio, ExcecaoContaJaExistente, ExcecaoContaInexistente {
		
		Scanner scan = new Scanner(System.in);
		int teste;
		int[] myNum = {10, 20, 30, 40, 50};
		System.out.println("Digita a conta: ");
		teste = scan.nextInt();
		Conta cont = new Conta();
		
		cont.adicionar(teste);
		cont.verificarContaExistente(teste);
		cont.verificarContaInexistente(teste);
		
	}
	public void inserir() {
		
	}
	public void buscar() {
		
	}

}
