package recursividad;

public class Ejercicio4 {

	String text = "Dabale arroz a la zorra el abad";

	public boolean isPalindrome(String text) {
		text = text.replace(" ", "").toLowerCase();

		if (text.length() <= 1) {
			return true;
		} else if (text.charAt(0) != text.charAt(text.length() - 1)) {
			return false;
		} else {
			return isPalindrome(text.substring(1, text.length() - 1));
		}
	}

	public void show() {
		System.out.printf(" %s palíndroma%n", text, isPalindrome(text) ? "es" : "no es");
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}
}