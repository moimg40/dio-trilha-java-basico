package edu.dio.exercicios.loops;
import java.util.Scanner;

/* Programa gerador de tabuada capaz de gerar a tabuada de qualquer número
inteiro entre 1 e 10. O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

public class Ex5_Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		System.out.println("Tabuada de " + numero);
		for(int i = 1 ; i <= 10 ; i++)
			System.out.println(numero + " x " + i + " = " + (numero * i));
	}
}
