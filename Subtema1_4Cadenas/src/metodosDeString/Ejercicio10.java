package metodosDeString;

public class Ejercicio10 {

	public void show() {
		String text1 = "Hola ";
		String text2 = "mundo ";
		String text3 = "Java";

		String result = text1.concat(text2).concat(text3);

		System.out.printf("%s%n", result);
	}

	public static void main(String[] args) {
		new Ejercicio10().show();
	}

}