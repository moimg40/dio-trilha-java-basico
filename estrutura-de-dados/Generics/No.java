package edu.dio.no;

public class No<T> {
	private T conteudo;
	private No<T> proxNo;

	public No(T conteudo) {
		this.proxNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProxNo() {
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
