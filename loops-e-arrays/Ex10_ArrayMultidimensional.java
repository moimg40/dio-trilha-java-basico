package edu.dio.exercicios.arrays;
import java.util.Random;

/* Programa que gera uma matriz M 4x4 com valores entre 0-9. */

public class Ex10_ArrayMultidimensional {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] M = new int[4][4];

		for(int i = 0 ; i < M.length ; i++) {
			for(int j = 0 ; j < M[i].length ; j++) {
				M[i][j] = rnd.nextInt(9);
			}
		}

		for(int i = 0 ; i < M.length ; i++) {
			for(int j = 0 ; j < M[i].length ; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
