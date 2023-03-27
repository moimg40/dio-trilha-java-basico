package edu.dio.exercicios.loops;

import java.util.Scanner;

/* Programa que peça uma nota entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
 e continue pedindo até que o usuário informe
 um valor válido. */

 public class Ex2_Nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;

		do {
			System.out.println("Nota: ");
			nota = sc.nextInt();
		}while (nota < 0 || nota > 10);

		System.out.println("Nota diditada " + nota);
	}
 }
