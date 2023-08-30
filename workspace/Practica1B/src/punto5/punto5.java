package punto5;

public class punto5 {
	public static void main (String[] args) {
		int[] arrayInt = {22,23,45,76,34};
		
		arregloEnteros arrayObj = new arregloEnteros(5);
		
		arrayObj.addInteger(22);
		arrayObj.addInteger(23);
		arrayObj.addInteger(45);
		arrayObj.addInteger(76);
		arrayObj.addInteger(34);
		
	
		imprimir(maxMinProm(arrayInt),"Punto a");
		imprimir(maxMinProm(arrayObj),"Punto b");
		imprimir(arrayObj.maxMinProm(),"Punto c");
		
	}
	private static void imprimir(int[] arreglo, String texto) {
		System.out.println(texto);
		System.out.println("Maximo: " + arreglo[0]);
		System.out.println("Minimo: " + arreglo[1]);
		System.out.println("Promedio: " + arreglo[2]);
	}
	private static int[] maxMinProm(int[] arrayInt){
		int[] result = new int[3];
		int max = 0;
		int sum = 0;
		int min = 99999;
		for (int integer: arrayInt) {
			if (integer > max) {
				max = integer;
			}
			if (integer < min) {
				min = integer;
			}
			sum = sum + integer;
		}
		sum = sum / arrayInt.length;
		
		result[0] = max;
		result[1] = min;
		result[2] = sum;
		
		return result;
		
	}
	private static int[] maxMinProm(arregloEnteros arrayObj){
		Integer[] arrayInt = arrayObj.getArreglo();
		int[] result = new int[3];
		int max = 0;
		int sum = 0;
		int min = 99999;
		for (int integer: arrayInt) {
			if (integer > max) {
				max = integer;
			}
			if (integer < min) {
				min = integer;
			}
			sum = sum + integer;
		}
		sum = sum / arrayInt.length;
		
		result[0] = max;
		result[1] = min;
		result[2] = sum;
		
		return result;
	}
}
