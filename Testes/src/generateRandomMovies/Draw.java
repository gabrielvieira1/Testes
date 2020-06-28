package generateRandomMovies;

public class Draw {

	private static final int times = 6000000;
	
	public static void main(String[] args) {
		RandomCollection<Movie> rc = new RandomCollection<>();
		
		Movie[] filmes = {
			new Movie("Vingadores"),
			new Movie("Simplesmente Acontece"),
			new Movie("Como Treinar o seu Dragão", 2)
		};
		
		for (Movie filme : filmes) {
			rc.add(filme);
		}

		Movie filme = null;
		for (int roll = 1; roll <= times; roll++) {
			filme = rc.next();
			filme.setFrequency(filme.getFrequency() + 1);
		}

		System.out.println("Último sorteado: " + filme.getName());

		System.out.println();
		System.out.println("Votos\tFrequency\tNome");

		for (Movie f : rc.getData()) {
			System.out.println(
				f.getVotos() + "\t" +
				f.getFrequency() + "\t\t" +
				f.getName());
		}
	}

}