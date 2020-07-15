package arrayEArrayLists;

public class SalesCommission {

	public static void main(String[] args) {
		int[] arrayVendas = {200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		for (int count = 0; count < arrayVendas.length; count++) {
			if (arrayVendas[count] == 1000)
				System.out.printf("R$%5d:    ", 1000);
			else
				System.out.printf("R$ %02d-%02d: ", arrayVendas[count], arrayVendas[count] + 99);
			CalcComissao(arrayVendas[count]);
			System.out.println();
		}

		System.out.println();
	}

	public static void CalcComissao(int arrayVendas) {

		int[] vendas = new int[100];
		int comissao = 0;

		for (int i = 0; i <= 99; i++) {
			vendas[i] = arrayVendas + i;
			comissao = (200 + ((9 * vendas[i]) / 100));
			System.out.printf("%4s,", comissao);

		}

	}

}
