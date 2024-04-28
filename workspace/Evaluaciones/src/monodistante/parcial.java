package monodistante;
import arbol.*;
public class parcial {
	ArbolBinario<Integer> ab;
	public boolean resolver(int i) {
		if (!ab.esVacio()) {
			boolean sigue = true;
			int cont = 0;
			return preOrden(ab,i,sigue,cont);
		}else return false;
	}
	
	private boolean preOrden (ArbolBinario<Integer>ab, int i, boolean sigue,int cont) {
		if (sigue) {
			if (ab.esHoja()) {
				sigue = (i == cont);
			}else{
				cont += ab.getDato();
				if (ab.tieneHijoIzquierdo()) sigue = preOrden(ab.getHijoIzquierdo(),i,sigue,cont);
				if (ab.tieneHijoDerecho()) sigue = preOrden(ab.getHijoDerecho(),i,sigue,cont);
			}
		} else {
			sigue = false;
		}
		return sigue;
	}
}

