package edu.dio.metodos.exercicio2;

/**
 *Classe de exemplo para o exercício da aula 2 de métodos.
 */

public class CalcularAreaQuadrilateros {

	public static void area(double lados) {
		// Método que calcula área de um quadrado
		System.out.println("Área do quadrado: " + lados * lados);
	}

	public static void area(double base, double altura) {
		// Método que calcula área de um retângulo
		System.out.println("Área do retângulo: " + base * altura);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		// Método que calcula área de um trapézio
		System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * 5) / 2);
	}
}
