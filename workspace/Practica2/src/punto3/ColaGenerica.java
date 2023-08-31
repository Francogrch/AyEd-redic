package punto3;
import ListasGenericas.*;
public class ColaGenerica<T> {
	ListaGenerica<T> lista;
	
	public ColaGenerica(){
		lista = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar(T elem) {
		lista.agregarFinal(elem);
	}
	public T desencolar(){
		T retorno = lista.elemento(1);
		lista.eliminarEn(1);
		return retorno;
	}
	public T tope() {
		return lista.elemento(1);
	}
	public boolean esVacia(){
		return lista.esVacia();
	}
}
