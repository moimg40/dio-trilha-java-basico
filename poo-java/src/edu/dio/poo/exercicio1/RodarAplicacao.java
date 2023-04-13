package edu.dio.poo.exercicio1;

/**
* Classe de exemplo para o exercício sobre Orientação a Objetos.
*/

class RodarAplicacao {
	public static void main(String args[]) {
		Carro c1 = new Carro();

		c1.setCor("Azul");
		c1.setModelo("BMW Série 3");
		c1.setCapacidadeTanque(59);

		System.out.println(c1.getModelo());
		System.out.println(c1.getCor());
		System.out.println(c1.getCapacidadeTanque());
		System.out.println(c1.totalValorTanque(5.59));

		Carro c2 = new Carro("Cinza", "Mercedez-Benz Classe C", 66);

		System.out.println(c2.getModelo());
		System.out.println(c2.getCor());
		System.out.println(c2.getCapacidadeTanque());
		System.out.println(c2.totalValorTanque(5.59));
	}
}
