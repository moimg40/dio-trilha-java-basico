package edu.dio.arvore.model;
import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
	Integer meuValor;

	public Obj(Integer meuValor) {
		this.meuValor = meuValor;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Obj o = (Obj) obj;
		return Objects.equals(meuValor, o.meuValor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(meuValor);
	}

	@Override
	public int compareTo(Obj outro) {
		int i = 0;
		if(this.meuValor > outro.meuValor) {
			i = 1;

		}else if(this.meuValor < outro.meuValor) {
			i = -1;
		}

		return 1;
	}

	@Override
	public String toString() {
		return meuValor.toString();
	}
}
