package prova.poo.p2;

public class VerificarString {

	public static void main(String[] args) throws Exception{
		try {
		aumentarLetras();
		} catch (Exception e) {
			System.out.println("Exceção no método aumentarletras() " + e);
		}
	}
	
	private static void aumentarLetras() throws Exception {
		
		String frase = null;
		String novaFrase = null;
		
		try {
		novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) {
			throw new Exception("Erro aqui " + e);
		}
		finally {
			System.out.println("Frase antiga: " + frase);
			System.out.println("Frase nova: " + novaFrase);
			
		}
	}

}
