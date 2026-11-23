package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio5 {

	int[] numbers = {1, 2, 3}, reversed;

	public int[] reverse(int[] numbersArray) {
		int[] inner, result;
		if (numbersArray.length == 0 || numbersArray.length == 1) {
			// Casos base
			result = numbersArray;
		} else {
			// Caso recursivo: array.length >= 2
			inner = Arrays.copyOfRange(numbersArray, 1, numbersArray.length - 1);
			inner = reverse(inner);
			result = new int[numbersArray.length];
			result[0] = numbersArray[numbersArray.length - 1];
			System.arraycopy(inner, 0, result, 1, inner.length);
			result[numbersArray.length - 1] = numbersArray[0];
		}
		return result;
	}

	public void show() {
		System.out.printf("Original array: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%d ", numbers[i]);
		}
		System.out.println();

		reversed = reverse(numbers);

		System.out.printf("Reversed array: ");
		for (int i = 0; i < reversed.length; i++) {
			System.out.printf("%d ", reversed[i]);
		}
		
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}
}