package printf;

public class Ejercicio2 {

	public void show() {

		System.out.printf("%sRojo%s %sVerde%s %sAzul%s%n", Colors.RED, Colors.RESET, Colors.GREEN, Colors.RESET,
				Colors.BLUE, Colors.RESET);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}