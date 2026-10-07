package printf;

import java.util.Locale;

public class Ejercicio1 {

	public void show() {
		int x = 10;
		int y = -10;
		float n = 13.269834f;
		String cad = "Ana";

		Locale.setDefault(Locale.US);

		System.out.printf("%d%n", x);
		System.out.printf("%+d%n", x);
		System.out.printf("%+d%n", y);
		System.out.printf("%.2f%n", n);
		System.out.printf("%+10.4f%n", n);
		System.out.printf("%10.5f%n", n);
		System.out.printf("%+010.3f%n", n);
		System.out.printf("n=%.2f\tx=%d%n", n, x);
		System.out.printf("%10s%3s%5s%n", cad, cad, cad);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}