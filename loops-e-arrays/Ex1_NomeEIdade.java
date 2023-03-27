package edu.dio.exercicios.loops;
import java.util.Scanner;

/* Programa que lê conjuntos de dois valores,
o primeiro representando o nome do aluno e o
segundo a sua idade. O programa deve parar
quando o usuário inserir o valor 0 no campo nome. */

public class Ex1_NomeEIdade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;

		while(true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;
			System.out.println("Idade: ");
			idade = sc.nextInt();
		}

		System.out.println("Continua aqui...");
	}
}
