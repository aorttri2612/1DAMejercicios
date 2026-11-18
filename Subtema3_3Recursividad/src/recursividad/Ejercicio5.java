package recursividad;

public class Ejercicio5 {

	String text = "hola";

	public String reverse(String text) {
		String result;

		if (text.length() <= 1) {
			return text;
		} else {
			result = reverse(text.substring(1));
			result += text.charAt(0);
			return result;
		}
	}

	public void show() {
		System.out.printf("\"%s\" al revés es \"%s\"%n", text, reverse(text));
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}
}