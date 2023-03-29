package edu.dio.no;

public class Main {
	public static void main(String[] args) {
		No n1 = new No("Conteúdo no1");
		No n2 = new No("Conteúdo no2");
		n1.setProxNo(n2);

		No n3 = new No("Conteúdo no3");
		n2.setProxNo(n3);

		No n4 = new No("Conteúdo no4");
		n3.setProxNo(n4);

		// no1 -> no2 -> no3 -> no4 -> null

		System.out.println(n1);
		System.out.println(n1.getProxNo());
		System.out.println(n1.getProxNo().getProxNo());
		System.out.println(n1.getProxNo().getProxNo().getProxNo());
		System.out.println(n1.getProxNo().getProxNo().getProxNo().getProxNo());
	}
}
