package recursividad;

public class Ejercicio2 {

	int base = 2, exponent = 5;

	public int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * power(base, exponent - 1);
		}
	}

	public void show() {
		System.out.printf("%d elevado a %d es %d%n", base, exponent, power(base, exponent));
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}