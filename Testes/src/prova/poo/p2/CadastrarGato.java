package prova.poo.p2;

public class CadastrarGato {
	public Gato buscarGato(String nome) throws GatoNaoEncontrado {
		if (existeGato(nome)) {
			
		} else {
			throw new GatoNaoEncontrado("O gato de nome = " + nome + " não está cadastrado!");
		}
		return null;
	}
	private boolean existeGato(String nome) {
		String gato = null;
		if (gato == nome) {
			return true;
		}
		return false;
	}

}
