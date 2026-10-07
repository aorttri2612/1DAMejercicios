package metodosDeString;

public class Ejercicio8 {

	public void show() {
		String text = "   Hola mundo   ";

		System.out.printf("Con espacios: %s%n", text);
		System.out.printf("Sin espacios: %s%n", text.trim());
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}

}