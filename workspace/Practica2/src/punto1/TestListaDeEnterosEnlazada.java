package punto1;
import ListaDeEnteros.*;
public class TestListaDeEnterosEnlazada {
	public static void main(String[] args){
		ListaDeEnterosEnlazada array = new ListaDeEnterosEnlazada();
		for (String str: args) {
			int integer = Integer.parseInt(str);
			array.agregarInicio(integer);
		}
		array.comenzar();
		while (!array.fin()){
			System.out.println(array.proximo());
		}
		
	}
}
