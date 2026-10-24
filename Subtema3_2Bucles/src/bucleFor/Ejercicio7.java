package bucleFor;

public class Ejercicio7 {

	String text;

	public void countWords() {
		int words, i;
		boolean inWord;

		text = "   Voy   a   aprobar   programacion";
		words = 0;
		inWord = false;

		for (i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				if (!inWord) {
					words++;
					inWord = true;
				}
			} else {
				inWord = false;
			}
		}

		System.out.printf("Text: \"%s\"%n", text);
		System.out.printf("Number of words: %d%n", words);
	}

	public void show() {
		countWords();
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}
}