package punto3;
import ListasGenericas.*;
public class PilaGenerica<T> {
	ListaGenerica<T> lista;
	
	public PilaGenerica(){
		lista = new ListaEnlazadaGenerica<T>();
	}
	
	public void apilar(T elem) {
		lista.agregarInicio(elem);
	}
	public T desapilar(){
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
