package poo.slide2.encapsulamento;

public class AlunoAbstracaoDeDados {
	
	//Propriedaes (Atributos)
	public String nome;
	public int idade;
	public static double nota;
	
	//Comportamentos (Metodos)
	public static double atualizarNota() {
		
		return nota + 0.5;
	}

	public static void main(String[] args) {
		
		System.out.println(atualizarNota());
	}

}
