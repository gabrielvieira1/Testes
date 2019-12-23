package lista.poo.ex4;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CPF {
	
	public static void main(String[] args) {
		String cpf = "10747288402";
		try {
			System.out.println(formatarCpf(cpf));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static String formatarCpf(String cpf) throws ParseException {
		MaskFormatter mask = new MaskFormatter("###.###.###-##");
		mask.setValueContainsLiteralCharacters(false);
		return mask.valueToString(cpf);
	}
	

}
