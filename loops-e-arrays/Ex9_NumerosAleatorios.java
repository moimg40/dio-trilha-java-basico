package edu.dio.exercicios.arrays;
import java.util.Scanner;
import java.util.Random;

/* Programa que gera 20 números inteiros aleatórios entre 0 e 100 e armazena-os
em um  vetor. Depois exibe os números e seus sucessores. */

public class Ex9_NumerosAleatorios {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] nAleatorios = new int[20];

		for(int i = 0 ; i < nAleatorios.length ; i++) {
			int numero = rnd.nextInt(100);
			nAleatorios[i] = numero;
		}

		System.out.print("Números aleatórios: ");
		for(int n : nAleatorios)
			System.out.print(n + " ");

		System.out.print("\nSucessores dos números aleatórios: ");
		for(int n : nAleatorios)
			System.out.print((n + 1) + " ");

		System.out.println("\n");
	}
}
