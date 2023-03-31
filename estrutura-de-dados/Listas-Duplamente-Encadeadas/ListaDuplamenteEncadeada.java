package edu.dio.listadupla;

public class ListaDuplamenteEncadeada<T> {
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;

	private int tamanhoLista;

	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}

	public T get(int indice) {
		return this.getNo(indice).getConteudo();
	}

	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);

		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);

		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}

		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}

		ultimoNo = novoNo;

		tamanhoLista++;
	}

	public void add(int indice, T elemento) {
		NoDuplo<T> noAuxiliar = getNo(indice);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(noAuxiliar);

		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}

		if(indice == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}

		tamanhoLista++;
	}

	public void remove(int indice) {
		if(indice == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}else {
			NoDuplo<T> noAuxiliar = getNo(indice);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar;
			}
		}

		this.tamanhoLista--;
	}

	private NoDuplo<T> getNo(int indice) {
		NoDuplo<T> noAuxiliar = primeiroNo;

		for(int i = 0 ; (i < indice) && (noAuxiliar != null) ; i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}

		return noAuxiliar;
	}

	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";

		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0 ; i < size() ; i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();

		}
		strRetorno += "null";
		return strRetorno;
	}
}
