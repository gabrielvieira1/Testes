package prova.poo.p1;

public class PrincipalContratos {

	public static void main(String[] args) {
		
		Contratos contrato = new Contratos("Im�vel", 15);
		Contratos.PessoaJuridica pJ = contrato.new PessoaJuridica("Atacado");
		Contratos.PessoaFisica pF = contrato.new PessoaFisica("Jos�");
		pF.imprimir();
		pJ.imprimir();
		
	}

}
