package metodosDeString;

public class Ejercicio5 {

	public void show() {
		String text1 = "Casa";
		String text2 = "Perro";

		int result = text1.compareTo(text2);

		String high = result > 0 ? text1 : text2;

		System.out.printf("%s es lexicográficamente mayor%n", high);
	}

	public static void main(String[] args) {
		new Ejercicio5().show();

	}

}
