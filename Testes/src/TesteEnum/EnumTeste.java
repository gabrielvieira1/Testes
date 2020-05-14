package TesteEnum;

public enum EnumTeste {
	
	SOMAR(1), SUBTRAIR(2), DIVIDIR(3), MULTIPLICAR(4), CALCUAR_NOTA(5);
	
	private int valor;
	
	EnumTeste(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
