package cadenas;

public class Ejercicio4 {

	public void show() {
		String text = "      Bienvenidos al módulo de PROGRAMACIÓN      ";

		System.out.printf("%s%n", text.trim().toLowerCase().replace("programación", "Java").toLowerCase());
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}