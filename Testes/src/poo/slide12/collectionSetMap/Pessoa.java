package poo.slide12.collectionSetMap;

public class Pessoa {
	private int id;
	private String nome;
	private String sexo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo =sexo;
	}
	
	public String toString() {
		return"ID: " + id + " Nome: " + nome + " Sexo: " + sexo;
	}
}
