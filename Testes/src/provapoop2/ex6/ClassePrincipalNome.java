package provapoop2.ex6;

import provapoop2.ex6.NomeSobrenome.Nome;
import provapoop2.ex6.NomeSobrenome.Sobrenome;

public class ClassePrincipalNome {

	public static void main(String[] args) {
		
		NomeSobrenome.Nome nome =  new NomeSobrenome.Nome("José");
		NomeSobrenome.Sobrenome sobrenome = new NomeSobrenome.Sobrenome("Silva");
		NomeSobrenome nomeSobrenome = new NomeSobrenome(nome, sobrenome);
		System.out.println(nome.getNome() + " " + sobrenome.getSobrenome());
	}

}
