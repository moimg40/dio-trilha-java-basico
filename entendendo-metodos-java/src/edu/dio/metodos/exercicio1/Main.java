package edu.dio.metodos.exercicio1;

/**
Classe principal dos exercícios da Aula 1 de métodos.
**/

public class Main {

	public static void main(String[] args) {

		// Calculadora
		System.out.println("\nExercício calculadora: ");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);

		// Mensagem
		System.out.println("Exercício Saudação do dia: ");
		Mensagem.saudacao(14);

		// Cálculo de empréstimo
		System.out.println("\nEmpréstimo: ");
		Emprestimo.Calcular(5000, 3);
	}
}
