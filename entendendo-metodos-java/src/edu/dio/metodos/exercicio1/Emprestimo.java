package edu.dio.metodos.exercicio1;

public class Emprestimo {

	public static void Calcular(double valor, int parcelas) {

		if(parcelas == 2) {
			double valorTotal = valor + (valor * 0.3);
			System.out.println("Valor final do empréstimo com duas parcelas : R$ " + valorTotal);
		}else if (parcelas == 3) {
			double valorTotal = valor + (valor * 0.45);
			System.out.println("Valor final do empréstimo com duas parcelas : R$ " + valorTotal);
		}else {
			System.out.println("Quantidade de parcelas não aceita.");
		}
	}

}
