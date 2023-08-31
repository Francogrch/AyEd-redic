package punto1;
import ListaDeEnteros.*;
public class punto1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnteros lista = new ListaDeEnterosEnlazada();
		lista.agregarInicio(1);
		lista.agregarInicio(2);
		lista.agregarInicio(3);
		lista.agregarInicio(4);
		imprimirInverso(lista);
	}
	
	public static void imprimirInverso(ListaDeEnteros l) {
		l.comenzar();
		imprimirInversoRecursivo(l);
	}
	private static void imprimirInversoRecursivo(ListaDeEnteros l ) {
		if (!l.fin()) {
			int integer = l.proximo();
			imprimirInversoRecursivo(l);
			System.out.println(integer);
		}
	}
}
