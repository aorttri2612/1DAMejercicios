package expresiones;

public class Ejercicio1 {
	
	public void show() {
		final int a = 3, b = 5, c = 4, d = 2, e = 7, f = 8, g = 6;

		int final1, final2;
		boolean final3, final4, final5;

		// 1. 3 * 5 - 4 / 2
		final1 = a * b - c / d;
		System.out.println(final1);

		// 2. 7 - 4 * 2 - 5 * 2
		final2 = e - c * d - b * d;
		System.out.println(final2);

		// 3. 5 + 4 < 7 + 8
		final3 = b + c < e + f;
		System.out.println(final3);

		// 4. 4 < 5 * 4 / 2 - 7
		final4 = a < b * c / d - e;
		System.out.println(final4);

		// 5. !(4 > 6)
		final5 = !(c > g);
		System.out.println(final5);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}
}
