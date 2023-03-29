package edu.dio.no;

public class No {
	private String conteudo;
	private No proxNo;

	public No(String conteudo) {
		this.proxNo = null;
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProxNo() {
		return proxNo;
	}

	public void setProxNo(No proxNo) {
		this.proxNo = proxNo;
	}

	//@Overridie
	public String toString() {
		return "No{" +
			"conteudo='" + conteudo + '\'' +
			'}';
	}
}
