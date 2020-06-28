package EstruturaDeDados;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Cliente {
	private String nome;
	private String cpf;
	private String fone;
	private String email;
	
	public Cliente(String nome, String cpf, String fone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		
		try {
			return "Nome: " + getNome() + " CPF: " + formatarCpf(getCpf()) + " Fone: " + formatarNumero(getFone()) + " Email: " + getEmail();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String formatarCpf(String cpf) throws ParseException {
		MaskFormatter mask = new MaskFormatter("###.###.###-##");
		mask.setValueContainsLiteralCharacters(false);
		return mask.valueToString(cpf);
	}
	
	public static String formatarNumero(String numero) throws ParseException {
		MaskFormatter mask = new MaskFormatter("##.####-####");
		mask.setValueContainsLiteralCharacters(false);
		return mask.valueToString(numero);
	}
	
}
