package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Compare {

	public void show() {

		int result;
		boolean[] arrayBoolean1 = { true, true, false };
		boolean[] arrayBoolean2 = { true, true, true };
		char[] arrayChar1 = { 'm', 'n', 't' };
		char[] arrayChar2 = { 'm', 'n', 'a' };
		char[] arrayChar3 = { 'M', 'n', 'a' };
		int[] arrayInt1 = { 3, 4, 5 };
		int[] arrayInt2 = { 3, 4, 5 };
		int[] arrayInt3 = { 3, 4, 5, 6 };

		result = Arrays.compare(arrayBoolean1, arrayBoolean2);
		System.out.printf("El resultado de comparar %s y %s es: ", Arrays.toString(arrayBoolean1),
				Arrays.toString(arrayBoolean2));
		comparison(result);

		result = Arrays.compare(arrayChar1, arrayChar2);
		System.out.printf("El resultado de comparar %s y %s es: ", Arrays.toString(arrayChar1),
				Arrays.toString(arrayChar2));
		comparison(result);

		result = Arrays.compare(arrayChar3, arrayChar2);
		System.out.printf("El resultado de comparar %s y %s es: ", Arrays.toString(arrayChar3),
				Arrays.toString(arrayChar2));
		comparison(result);

		result = Arrays.compare(arrayInt1, arrayInt2);
		System.out.printf("El resultado de comparar %s y %s es: ", Arrays.toString(arrayInt1),
				Arrays.toString(arrayInt2));
		comparison(result);

		result = Arrays.compare(arrayInt1, arrayInt3);
		System.out.printf("El resultado de comparar %s y %s es: ", Arrays.toString(arrayInt1),
				Arrays.toString(arrayInt3));
		comparison(result);

		result = Arrays.compare(arrayInt1, 0, 3, arrayInt3, 0, 3);
		System.out.printf("El resultado de comparar %s y %s en el rango 0-2 es: ", Arrays.toString(arrayInt1),
				Arrays.toString(arrayInt3));
		comparison(result);

	}

	public void comparison(int result) {
		if (result == 0) {
			System.out.println("los arrays son iguales");
		} else if (result < 0) {
			System.out.println("el primer array es menor");
		} else {
			System.out.println("el primer array es mayor");
		}
	}

	public static void main(String[] args) {

		new Compare().show();

	}

}
