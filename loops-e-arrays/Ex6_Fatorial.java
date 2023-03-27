package edu.dio.exercicios.loops;
import java.util.Scanner;

/* Programa que calcula o fatorial de um número fornecido pelo usuário. */

public class Ex6_Fatorial {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, nDigitado, fatorial;

		System.out.println("Digite o número para calcular o fatorial: ");
		numero = sc.nextInt();
		fatorial = nDigitado = numero;

		while (numero > 1) {
			fatorial *= (numero - 1);
			numero -= 1;
		}

		System.out.println(nDigitado + "!= " + fatorial);
	}
}
