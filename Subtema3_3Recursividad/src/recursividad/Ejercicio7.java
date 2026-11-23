package recursividad;

public class Ejercicio7 {

	String text = "  Estoy     matriculado    en    Programación    en     Entornos     y     en        Marcas  ";

	public int countWords(String text) {
		if (text.length() == 0) {
			return 0;
		} else if (text.length() == 1) {
			if (text.charAt(0) != ' ') {
				return 1;
			} else {
				return 0;
			}
		} else if (text.charAt(0) != ' ' && text.charAt(1) == ' ') {
			return 1 + countWords(text.substring(1));
		} else {
			return countWords(text.substring(1));
		}
	}

	public void show() {
		System.out.printf("La cadena tiene %d palabras%n", countWords(text));
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}
}