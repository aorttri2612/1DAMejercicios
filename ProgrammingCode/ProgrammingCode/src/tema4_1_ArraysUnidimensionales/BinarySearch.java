package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class BinarySearch {

	public void show() {

		int lowerRange, higherRange;
		int[] array = { 3, 4, 5, 6, 7, 8 };
		int number = 9;
		int index = Arrays.binarySearch(array, number);
		if (index >= 0) {
			System.out.printf("El número %d se encuentra en el índice %d\n", number, index);
		} else {
			System.out.printf("El número %d no se encuentra en el array\n", number);
		}
		lowerRange = 3;
		higherRange = 6;//Como está excluido, se busca hasta el índice 5
		index = Arrays.binarySearch(array, lowerRange, higherRange, number);
		if (index >= 0) {
			System.out.printf("El número %d se encuentra en el índice %d", number, index);
		} else {
			System.out.printf("El número %d no se encuentra en el array en el rango %d-%d", number, lowerRange,
					higherRange - 1);
		}

	}

	public static void main(String[] args) {

		new BinarySearch().show();

	}

}
