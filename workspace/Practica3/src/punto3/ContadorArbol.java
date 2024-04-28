package punto3;
import arbol.*;
import ListasGenericas.*;
public class ContadorArbol {
	private ArbolBinario<Integer> ab;
	public ListaGenerica<Integer> numerosPares(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		if (!ab.esVacio()) {
			this.nPr(ab,l);
		}
		return l;
	}
	private void nPr(ArbolBinario<Integer> ab,ListaGenerica<Integer> l) {
		if (ab.tieneHijoIzquierdo()) {
			nPr(ab.getHijoIzquierdo(),l);
		}
		if (ab.getDato() % 2 == 0) l.agregarFinal(ab.getDato());
		if (ab.tieneHijoDerecho()) nPr(ab.getHijoDerecho(),l);
	}
}
