package edu.dio.poo.exercicio2;

/**
* Classe de exemplo para o exercício sobre Orientação a Objetos.
*/

class RodarAplicacao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		// Upcast
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();

		// Downcast
		//Vendedor vendedor = (Vendedor) = new Funcionario();
	}

}
