package Colecao.Array;

public class ArrayTamanhoAjustavel {
	int array[];
	int cont;
	int tamanho;

//Inicializando as variáveis pelo construtor
	ArrayTamanhoAjustavel() { // Inicializando as variáveis pelo construtor
		array = new int[1];
		cont = 0;
		tamanho = 1;
	}

//Add elementos no final do array.
	void add(int dado) {
//Checa se o número de elementos é igual ao tamanho do array
		if (cont == tamanho) {
//Aumenta o tamanho do array
			aumentarArray();
		}
//insere um elemento no final do array
		array[cont] = dado;
		cont++;
	}

//Método que aumenta o tamanho do array.
	void aumentarArray() {
		int arrayTemp[] = null;
		if (cont == tamanho) {
//instancia o array temporario com o tamanho do array+1
			arrayTemp = new int[tamanho + 1];

			for (int i = 0; i < tamanho; i++) {
//Copia os elementos por posição
//do Array para o ArrayTemporário
				arrayTemp[i] = array[i];
			}
		}
//inicializa novamente a variável Array através do ArrayTemp
		array = arrayTemp;
// incrementa o tamanho.
		tamanho = tamanho + 1;
	}

	public static void main(String[] args) {
//instancia um obj da própria classe
		ArrayTamanhoAjustavel arrTamAjus = new ArrayTamanhoAjustavel();
//Add 5 valores(elementos) do tipo inteiro.
		arrTamAjus.add(1);
		arrTamAjus.add(10);
		arrTamAjus.add(15);
		arrTamAjus.add(20);
		arrTamAjus.add(25);
		arrTamAjus.add(30);
		arrTamAjus.add(35);
//imprime o conteúdo do Array através do objeto.
		System.out.println("Imprimir antes de redimensionar o Array");
		for (int i = 0; i < arrTamAjus.tamanho; i++) {
			System.out.println(arrTamAjus.array[i] + " ");
		}
		System.out.println("Tamanho Atual: " + arrTamAjus.array.length);
	}
}