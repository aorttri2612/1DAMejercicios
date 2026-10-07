package metodosDeString;

public class Ejercicio11 {

	public void show() {
		String text = "Me gusta Java. Java es fácil. Java es potente.";

		String result = text.replace("Java", "Python");

		System.out.printf("Original: %s%n", text);
		System.out.printf("Modificada: %s%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio11().show();
	}

}