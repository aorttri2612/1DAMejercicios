package recursividad;

public class Ejercicio1 {

	int a = 36, b = 60;

	public int mcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return mcd(b, a % b);
		}
	}

	public void show() {
		System.out.printf("El mcd de %d y %d es %d%n", a, b, mcd(a, b));
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}