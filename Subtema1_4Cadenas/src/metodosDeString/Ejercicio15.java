package metodosDeString;

public class Ejercicio15 {

	public void show() {
		String text = """
				Primera línea
				Segunda línea
				Tercera línea
				""";

		String result = text.indent(3);
		String result2 = result.indent(-2);

		System.out.printf("Con 3 espacios:%n%s%n", result);
		System.out.printf("Después de eliminar 2 espacios:%n%s", result2);
	}

	public static void main(String[] args) {
		new Ejercicio15().show();
	}

}