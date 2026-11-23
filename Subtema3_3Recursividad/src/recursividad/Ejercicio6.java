package recursividad;

public class Ejercicio6 {

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public void show() {
		System.out.printf("fibonacci(0) = %d%n", fibonacci(0));
		System.out.printf("fibonacci(1) = %d%n", fibonacci(1));
		System.out.printf("fibonacci(4) = %d%n", fibonacci(4));
		System.out.printf("fibonacci(7) = %d%n", fibonacci(7));
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}
}