package pooGenerics;

public class TestarEletrodomestico {
	
	public static void main(String[] args) {
		Eletrodomestico<TV> eletro1 = new Eletrodomestico<TV>(new TV(47, 0, 0, false));
		Eletrodomestico<Radio> eletro2 = new Eletrodomestico<Radio>(new Radio(95.9f, 0, Radio.FM));
		System.out.println(eletro1.getObjeto().getClass());
		System.out.println(eletro2.getObjeto().getClass());
	}

}
