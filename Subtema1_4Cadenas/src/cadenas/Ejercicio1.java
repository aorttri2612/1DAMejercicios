package cadenas;

public class Ejercicio1 {

	public void show() {
		CharSequence text = "Programación en Java";

		CharSequence result = text.subSequence(15, 19);

		System.out.printf("Subcadena: %s%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}