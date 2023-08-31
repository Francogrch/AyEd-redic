package punto4;

import punto3.*;

public class TestBalanceo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "{})";
		boolean esta = estaBalaceado(example);
		System.out.println(esta);
	}

	private static boolean estaBalaceado(String str) {
		int i = 0;
		boolean termina = false;
		PilaGenerica<Character> pila = new PilaGenerica<Character>();

		while (!termina && i < str.length()) {
			char c = str.charAt(i);
			if ((c == '{') | (c == '[') | (c == '(')) {
				pila.apilar(c);
				i = i + 1;
			} else {
				if (pila.esVacia()) {
					termina = true;
				} else {
					char cpila = pila.desapilar();
					if (((cpila == '{') && (c != '}')) | ((cpila == '[') && (c != ']'))
							| ((cpila == '(') && (c != ')'))) {
						termina = true;
					}
					i++;
				}
			}
		}
		return !termina;
	}
}
