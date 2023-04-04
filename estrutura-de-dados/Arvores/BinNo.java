package edu.dio.arvore;

public class BinNo<T extends Comparable<T>> {
	private T conteudo;
	private BinNo<T> noEsquerdo, noDireito;

	public BinNo(T conteudo) {
		this.conteudo = conteudo;
		noEsquerdo = noDireito = null;
	}

	public BinNo() {
	}

	public T getConteudo() {
		return conteudo;
	}

	public BinNo<T> getNoEsquerdo() {
		return noEsquerdo;
	}

	public BinNo<T> getNoDireito() {
		return noDireito;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public void setNoEsquerdo(BinNo<T> noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public void setNoDireito(BinNo<T> noDireito) {
		this.noDireito = noDireito;
	}

	@Override
	public String toString() {
		return "BinNo{" + "conteudo=" + conteudo + "}";
	}
}
