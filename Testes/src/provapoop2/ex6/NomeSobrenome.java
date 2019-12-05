package provapoop2.ex6;

public class NomeSobrenome {
	private Nome nome;
	private Sobrenome sobrenome;
	
	public NomeSobrenome(Nome nome, Sobrenome sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	static class Nome{
		private String nome;
		public String getNome() {
			return nome;
		}
		public Nome(String nome) {
			this.nome = nome;
		}
	}
	protected static class Sobrenome{
		private String sobrenome;

		public String getSobrenome() {
			return sobrenome;
		}
		public Sobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
	}

}
