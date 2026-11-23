package recursividad;

public class Ejercicio3 {

	String text = "Programación en Entornos de Desarrollo";

	public int countVowels(String text) {
		if (text.length() == 0) {
			return 0;
		} else if ("aeiouáéíóú".indexOf(Character.toLowerCase(text.charAt(0))) >= 0) {
			return 1 + countVowels(text.substring(1));
		} else {
			return countVowels(text.substring(1));
		}
	}

	public void show() {
		System.out.printf("\"%s\" tiene %d vocales%n", text, countVowels(text));
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}