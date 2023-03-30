package edu.dio.fila;

public class No<T> {
	private T obj;
	private No<T> refNo;

	public No() {
	}

	public No(T obj) {
		this.refNo = null;
		this.obj = obj;
	}

	public T getObject() {
		return obj;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setObject(T obj) {
		this.obj = obj;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No{" + "object=" + obj + '}';
	}
}
