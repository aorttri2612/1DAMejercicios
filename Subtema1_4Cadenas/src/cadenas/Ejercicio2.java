package cadenas;

public class Ejercicio2 {

	public void show() {
		String result = String.join(", ", "Java", "Python", "C++", "JavaScript");

		System.out.printf("%s%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}