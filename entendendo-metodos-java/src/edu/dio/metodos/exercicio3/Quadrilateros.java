package edu.dio.metodos.exercicio3;

/**
 *Classe de exemplo para o exercício da aula 2 de métodos.
 */

public class Quadrilateros {

	public static double area(double lados) {
		// Método que calcula área de um quadrado
		return (lados * lados);
	}

	public static double area(double base, double altura) {
		// Método que calcula área de um retângulo
		return (base * altura);
	}

	public static double area(double baseMaior, double baseMenor, double altura) {
		// Método que calcula área de um trapézio
		return (((baseMaior + baseMenor) * 5) / 2);
	}
}
