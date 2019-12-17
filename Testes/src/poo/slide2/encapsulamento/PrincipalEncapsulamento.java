package poo.slide2.encapsulamento;

public class PrincipalEncapsulamento {

	public static void main(String[] args) {
		OperationMathEncapsulamento op = new OperationMathEncapsulamento();
		op.realizaroperacao(2, 3, "*");
		op.setA(5);
		op.setB(10);
		System.out.println(op.getA() + op.getB());
	}

}
