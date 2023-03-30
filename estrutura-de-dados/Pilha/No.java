package edu.dio.pilha;

public class No {
	private int dado;
	private No refNo = null;

	public No() {

	}

	public No(int dado) {
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	public String soString() {
		return "No{" + "dado=" + dado + "}";
	}
}
