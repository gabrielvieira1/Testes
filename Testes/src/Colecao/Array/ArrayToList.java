package Colecao.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayToList {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
			String[] cores = { "vermelha", "azul", "amarelo" };
			LinkedList<String> links = new LinkedList<String>(Arrays.asList(cores));
			links.addLast("preta");
			links.add("violeta");
			links.add(3, "verde"); // Add na terceira posição
			links.addFirst("azul claro"); // Add na primeira posição
			cores = links.toArray(new String[links.size()]);
			System.out.println("Cores: ");
			for (String cor : cores)
				System.out.println(cor);
			int[] ar = new int[1];
			simpleArraySum(ar);
//			int sum = 0;
//			System.out.println("Digite o tamanho do array: ");
//			int tam = scan.nextInt();
//			int[] ar = new int[tam];
//			
//			
//			for (int i = 0; i < ar.length; i++) {
//				System.out.println("digite um numero: ");
//				ar[i] = scan.nextInt();
//				sum += ar[i];
//			}
//			System.out.println(sum);
		
	}
	
	 static int simpleArraySum(int[] ar) {
	        /*
	         * Write your code here.
	         */
	            int sum = 0;
	            System.out.println("Digite o tamanho do array: ");
	            int tam = scan.nextInt();
	            ar = new int[tam];
	            
	            
	            for (int i = 0; i < ar.length; i++) {
	                System.out.println("digite um numero: ");
	                ar[i] = scan.nextInt();
	                sum += ar[i];
	            }
	            System.out.println(sum);
	            return sum;

	    }
	
}



