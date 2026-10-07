package printf;

public class Ejercicio2 {

	public void show() {
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String azul = "\033[34m";

		String fondoRojo = "\033[41m";
		String fondoVerde = "\033[42m";
		String fondoAzul = "\033[44m";

		String reset = "\033[0m";

		System.out.printf("%sRojo%s %sVerde%s %sAzul%s%n", fondoRojo + rojo, reset, fondoVerde + verde, reset,
				fondoAzul + azul, reset);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}