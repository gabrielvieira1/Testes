package poo.slide2.encapsulamento;

public class OperationMathEncapsulamento {
	private float a, b;
	public void realizaroperacao(float x, float y, String op) {
		a =x;
		b=y;
		switch(op) {
		case "+":
			System.out.println(add(a,b));
			break;
		case "-":
			System.out.println(sub(a,b));
			break;
		case "*":
			System.out.println(mult(a,b));
			break;
		case "/":
			System.out.println(div(a,b));
			break;
			default:
				System.out.println("Operação realizada.");
		}
		
		
	}
	
	private float add(float z, float w) {
		return z + w;
	}
	private float sub(float z, float w) {
		return z-w;
	}
	
	private float mult(float z, float w) {
		return z*w;
	}
	private float div(float z, float w) {
		return z/w;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
