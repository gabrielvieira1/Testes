package prova.poo.p2;

public class CadastrarGato {
	public Gato buscarGato(String nome) throws GatoNaoEncontrado {
		if (existeGato(nome)) {
			
		} else {
			throw new GatoNaoEncontrado("O gato de nome = " + nome + " n�o est� cadastrado!");
		}
		return null;
	}
	private boolean existeGato(String nome) {
		return false;
	}

}
