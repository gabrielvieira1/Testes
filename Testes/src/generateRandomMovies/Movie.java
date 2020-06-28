package generateRandomMovies;

public class Movie {

	private int votos;
	private String name;
	private int frequency;

	public Movie(String name) {
		this.votos = 1;
		this.name = name;
		this.frequency = 0;
	}

	public Movie(String name, int votos) {
		this.name = name;
		this.votos = votos;
		this.frequency = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getVotos() {
		return votos;
	}
}