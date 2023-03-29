package edu.dio.exercicios.arrays;
import java.util.Scanner;

/* Programa que lê um vetor de 6 caracteres e informa quantas consoantes foram
lidas e as imprime. */

public class Ex8_Consoantes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		char letra;
		char[] consoantes = new char[6];
		String vogais = "aeiouAEIOU";
		int quantidadeConsoantes = 0;

		for(int i = 0 ; i < consoantes.length ; i++) {
			System.out.println("Digite a letra: ");
			letra = sc.next().charAt(0);
			if(vogais.indexOf(letra) == -1) {
				quantidadeConsoantes++;
				consoantes[i] = letra;
			}
		}

		if(quantidadeConsoantes > 0) {
			System.out.println("Foram lidas " + quantidadeConsoantes + " consoantes. Sendo elas: ");
			for(int i = 0 ; i < consoantes.length ; i++)
				if(consoantes[i] != 0) System.out.println(consoantes[i]);
		}else {
			System.out.println("Nenhuma consoante foi lida.");
		}
	}
}
