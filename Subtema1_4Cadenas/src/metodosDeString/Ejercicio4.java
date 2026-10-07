package metodosDeString;

public class Ejercicio4 {

	public void show() {
		int num1 = 10;
		int num2 = 20;

		int sum = num1 + num2;
		String concat = "" + num1 + num2;

		System.out.printf("Suma: %d%n", sum);
		System.out.printf("Concatenación: %s%n", concat);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
