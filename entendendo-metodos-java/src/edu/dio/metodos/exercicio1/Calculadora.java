package edu.dio.metodos.exercicio1;

/**
Classe de exemplo para o exercício da Aula 1 de métodos.
**/

public class Calculadora {

	public static void soma(double num1, double num2) {
		System.out.println("A soma de " + num1 + " e " + num2 + " é " + (num1 + num2));
	}

	public static void subtracao(double num1, double num2) {
		System.out.println("A diferença de " + num1 + " e " + num2 + " é " + (num1 - num2));
	}

	public static void multiplicacao(double num1, double num2) {
		System.out.println("O produto de " + num1 + " e " + num2 + " é " + (num1 * num2));
	}

	public static void divisao(double num1, double num2) {
		System.out.println("A divisão de " + num1 + " e " + num2 + " é " + (num1 / num2));
	}
}
