package tema13_ProgramacionFuncional;

import java.util.Scanner;

public class LambdaException {

	@SuppressWarnings("resource")
	public void show() {

		FunctionalInterface fi = () -> {
			Scanner keyboard = new Scanner(System.in);
			int num = keyboard.nextInt();
			return num;
		};
		try {
			System.out.printf("Introduce un número:");
			System.out.println(method(fi));
		} catch (Exception e) {
			System.err.println("Error en la lectura");
		}

	}

	public int method(FunctionalInterface fi) throws Exception {
		return fi.ioAction();
	}

	public static void main(String[] args) {

		new LambdaException().show();

	}

}
