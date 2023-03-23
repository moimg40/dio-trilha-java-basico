package edu.moi;

public class Usuario {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		
		System.out.println("Volume atual: " + smartTV.volume);
		
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.diminuirVolume();
		smartTV.aumentarVolume();
		
		System.out.println("TV ligada? " + smartTV.ligada);
		System.out.println("Canal atual? " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		
		smartTV.mudarCanal(15);
		System.out.println("Canal atual? " + smartTV.canal);
		
		smartTV.ligar();
		System.out.println("Novo status - TV ligada? " + smartTV.ligada);
		
		smartTV.desligar();
		System.out.println("Novo status - TV ligada? " + smartTV.ligada);
	}

}
