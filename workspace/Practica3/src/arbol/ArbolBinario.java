package arbol;
public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int retu = 0;
		if (this.esVacio()) retu = 0;
		else
			if (this.esHoja()) {
				retu = 1;
			}else {
				if (this.tieneHijoIzquierdo()) {
					retu = this.contarHojas();
				}
				if (this.tieneHijoDerecho()) {
					retu = retu + this.contarHojas();
				}
			}
		return retu;
	}
	

    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> aE = new ArbolBinario<T>();
		if (!this.esVacio()) {
			aE = new ArbolBinario<T>(this.getDato());
			if (this.tieneHijoIzquierdo()) aE.agregarHijoDerecho(this.getHijoDerecho().espejo());	
			if (this.tieneHijoDerecho()) aE.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}	
    	return aE;
	}


	public void entreNiveles(int n, int m){
		
	}

	

}
