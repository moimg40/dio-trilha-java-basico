package edu.dio.lista;

public class ListaEncadeada<T> {
	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);

		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}

		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0 ; i < this.size() - 1 ; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}

		noAuxiliar.setProximoNo(novoNo);
	}

	public T get(int indice) {
		return getNo(indice).getConteudo();
	}

	private No<T> getNo(int indice) {
		validaIndice(indice);

		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;

		for(int i = 0 ; i <= indice ; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}

	public T remove(int indice) {
		No<T> noPivor = this.getNo(indice);
		if(indice == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}

		No<T> noAnterior = getNo(indice - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}

	public int size() {
		int tamanhoLista = 0;

		No<T> referenciaAux = referenciaEntrada;

		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}

		return tamanhoLista;
	}

	public void validaIndice(int indice) {
		if(indice >= size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + indice + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
		}
	}

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;

		for(int i = 0 ; i < this.size() ; i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}

		strRetorno += "null";
		return strRetorno;
	}
}
