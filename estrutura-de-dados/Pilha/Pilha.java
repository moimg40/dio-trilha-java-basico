package edu.dio.pilha;

public class Pilha {
	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}

	public No top() {
		return refNoEntradaPilha;
	}

	public void push(No novoNo) {
		No refAux = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAux);
	}

	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}

	public boolean isEmpty() {
		if(refNoEntradaPilha == null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String strRetorno = "------------------------\n";
		strRetorno += "		Pilha\n";
		strRetorno += "------------------------\n";

		No noAux = refNoEntradaPilha;

		while(true) {
			if(noAux != null) {
				strRetorno += "[No{dado=" + noAux.getDado() + "}]\n";
				noAux = noAux.getRefNo();
			}else {
				break;
			}
		}
		strRetorno += "========================\n";
		return strRetorno;
	}
}
