package edu.dio.exercicios.loops;
import java.util.Scanner;

/* Programa que lê N números inteiros,
calcule e mostre a quantidade de números pares
 e a quantidade de números ímpares. */

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nNumeros, numero;
		int numPar = 0;
		int numImpar = 0;
		int count = 0;

		System.out.println("Quantidade de números: ");
		nNumeros = sc.nextInt();

		do {
			System.out.println("Número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0)
				numPar++;
			else
				numImpar++;

		}while(++count < nNumeros);

		System.out.println("Números pares: " + numPar);
		System.out.println("Números ímpares: " + numImpar);
	}
}
