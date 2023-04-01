package edu.dio.listacircular;

public class Main {
	public static void main(String[] args) {
		ListaCircular<String> minhaLista = new ListaCircular<>();

		minhaLista.add("c0");
		System.out.println(minhaLista);
		minhaLista.remove(0);
		System.out.println(minhaLista);
		minhaLista.add("c1");
		System.out.println(minhaLista);
		System.out.println(minhaLista.get(0));
	}
}
