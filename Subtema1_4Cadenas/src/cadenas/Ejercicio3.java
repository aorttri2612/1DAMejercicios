package cadenas;

public class Ejercicio3 {

	public void show() {
		StringBuilder text = new StringBuilder("Hola mundo");

		text.insert(5, "Java ");
		text.delete(0, 5);
		text.reverse();

		System.out.printf("%s%n", text);
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}