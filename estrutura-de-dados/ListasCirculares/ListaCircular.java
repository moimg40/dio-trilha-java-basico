package edu.dio.listacircular;

public class ListaCircular<T> {
	private No<T> cabeca, cauda;
	private int tamanhoLista;

	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.tamanhoLista == 0) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(cauda);
		}else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}

		this.tamanhoLista++;
	}

	public void remove(int indice) {
		if(indice >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");

		No<T> noAuxiliar = this.cauda;
		if(indice == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cauda);
		}else if (indice == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		}else {
			for(int i = 0 ; i < indice - 1 ; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		this.tamanhoLista--;
	}

	public T get(int indice) {
		return this.getNo(indice).getConteudo();
	}

	private No<T> getNo(int indice) {
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("A lista está vazia.");

		if(indice == 0) {
			return this.cauda;
		}

		No<T> noAuxiliar = this.cauda;
		for(int i = 0 ; (i < indice) && (noAuxiliar != null) ; i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}

		return noAuxiliar;
	}

	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}

	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = this.cauda;
		for(int i = 0 ; i < size() ; i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}

		strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";

		return strRetorno;
	}

}
