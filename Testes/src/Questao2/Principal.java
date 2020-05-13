package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		UtilEmpregado<Empregado1> empregado1 = new UtilEmpregado<Empregado1>(new Empregado1("Jos�", 8500));
		System.out.println(empregado1.getEmpregado().getNome() + " " + empregado1.getEmpregado().getSalario());

		UtilEmpregado<Empregado2> empregado2 = new UtilEmpregado<Empregado2>(new Empregado2("Maria", 10000));
		System.out.println("\n" + empregado2.getEmpregado().getNome() + " " + empregado2.getEmpregado().getSalario());

		UtilEmpregado<Empregado1> empregado3 = new UtilEmpregado<Empregado1>(new Empregado1("Pedro", 8500));
		System.out.println("\n" + empregado3.getEmpregado().getNome() + " " + empregado3.getEmpregado().getSalario());

		List<UtilEmpregado> empregados = new ArrayList<>();
		empregados.add(empregado1);
		empregados.add(empregado2);
		System.out.println(UtilEmpregado.salariosIguais(empregados));
		
		List<UtilEmpregado> empregados2 = new ArrayList<>();
		empregados2.add(empregado1);
		empregados2.add(empregado3);
		System.out.println(UtilEmpregado.salariosIguais(empregados2));

	}

}
