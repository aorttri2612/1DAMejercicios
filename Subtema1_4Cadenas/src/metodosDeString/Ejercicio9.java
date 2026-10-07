package metodosDeString;

public class Ejercicio9 {

	public void show() {
		String text = "Programación en Java";

		boolean start = text.startsWith("Pro");
		boolean end = text.endsWith("Java");

		System.out.printf("¿Empieza por Pro?: %b%n", start);
		System.out.printf("¿Termina por Java?: %b%n", end);
	}

	public static void main(String[] args) {
		new Ejercicio9().show();
	}

}