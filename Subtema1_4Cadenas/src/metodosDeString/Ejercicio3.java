package metodosDeString;

public class Ejercicio3 {

	public void show() {
		String text1 = "Hola";
		String text2 = "hola";

		System.out.printf("Con equals: %b%n", text1.equals(text2));
		System.out.printf("Con equalsIgnoreCase: %b%n", text1.equalsIgnoreCase(text2));
	}

	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
