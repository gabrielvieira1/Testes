package Questao2;

import java.util.List;

public class UtilEmpregado<T> {
	private T empregado;

	public UtilEmpregado(T empregado) {
		this.empregado = empregado;
	}

	public T getEmpregado() {
		return empregado;
	}

	public void setEmpregado(T empregado) {
		this.empregado = empregado;
	}
	
	public String getNome() {
		return ((Empregado) empregado).getNome();
	}
	
	public Double getSalario() {
		return ((Empregado) empregado).getSalario();
	}

	public static Boolean salariosIguais(List<UtilEmpregado> list) {

		if (list.get(0).getSalario().equals(list.get(1).getSalario())) {
			return true;
		} else {
			return false;
		}
		
	}

}
