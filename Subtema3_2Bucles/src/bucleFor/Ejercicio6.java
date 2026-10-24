package bucleFor;

public class Ejercicio6 {

	String text;
	char character;

	public void charsBetween() {
		int first, last, result, i;

		text = "arropar";
		character = 'r';
		first = -1;
		last = -1;

		for (i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}

		if (first == last) {
			result = 0;
		} else {
			result = last - first - 1;
		}

		System.out.printf("Text: \"%s\"%n", text);
		System.out.printf("Character: '%c'%n", character);
		System.out.printf("Characters between first and last appearance: %d%n", result);
	}

	public void show() {
		charsBetween();
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}
}