package punto5;

public class arregloEnteros {
	Integer[] arreglo;
	int pos;
	int max;
	int min;
	int promedio;

	public Integer[] getArreglo() {
		return arreglo;
	}
	public arregloEnteros(int amount) {
		arreglo = new Integer[amount];
		max = 0;
		pos = 0;
		min = 9999;
		promedio = 0;
	}

	public void addInteger(int x) {
		arreglo[pos] = x;
		pos++;
	}

	public int[] maxMinProm() {
		int[] result = new int[3];
		for (Integer integer : arreglo) {
			if (integer > max) {
				max = integer;
			}
			if (integer < min) {
				min = integer;
			}
			promedio = promedio + integer;
		}
		promedio = promedio / arreglo.length;
		;
		result[0] = max;
		result[1] = min;
		result[2] = promedio;
		
		return result;
	}

}
