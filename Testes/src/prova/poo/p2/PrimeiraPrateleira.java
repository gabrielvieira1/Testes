package prova.poo.p2;

import java.util.TreeSet;

public class PrimeiraPrateleira {

	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Mercadoria> m =new TreeSet<Mercadoria>();
		m.add(new Mercadoria(1));
		m.add(new Mercadoria(2));
		m.add(new Mercadoria(1));
		i.add(1);
		i.add(2);
		i.add(1);
		System.out.println(m.size() + " " + i.size());
	}

}
