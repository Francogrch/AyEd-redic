package punto1;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 5;
		System.out.println("For------------");
		recorridoFor(a,b);
		System.out.println("While------------");
		recorridoWhile(a,b);		
		System.out.println("Sin Estructura------------");
		recorridoSinEstructura(a,b);
	}

	private static void recorridoFor(int a, int b) {
		for (int i = a;i <= b;i++) {
			System.out.println(i);
		}
	}
	private static void recorridoWhile(int a, int b) {
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
	private static void recorridoSinEstructura(int a, int b) {
		if (a <= b) {
			System.out.println(a);
			a++;
			recorridoSinEstructura(a,b);
		}	
	}
}
