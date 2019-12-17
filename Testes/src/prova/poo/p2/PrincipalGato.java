package prova.poo.p2;

public class PrincipalGato {
	public static void main(String[] args) {
		try {
			CadastrarGato cadGato = new CadastrarGato();
			Gato gato = cadGato.buscarGato("Garfield");
			
		} catch (GatoNaoEncontrado g) {
			System.out.println(g.getMessage());
		}
	}

}
