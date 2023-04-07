package edu.dio.metodos.exercicio1;

/**
de exemplo para o exercício da Aula 1 de métodos.
**/

public class Mensagem {

	public static void saudacao(int hora) {

		if(hora >= 0 && hora < 12) {
			System.out.println("Bom dia!");
		}else if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}else if (hora >= 18 && hora <= 23){
			System.out.println("Boa noite!");
		} else {
			System.out.println("Digite uma hora válida!");
		}

	}
}
