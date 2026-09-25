package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Mismatch {

	public void show() {

		int[] array1 = { 3, 4, 5, 6, 7, 8 };
		int[] array2 = { 3, 4, 5, 6, 7, 8 };
		int[] array3 = { 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int indexMismatch;

		indexMismatch = Arrays.mismatch(array1, array2);

		if (indexMismatch == -1) {
			System.out.printf("%s y %s son iguales\n", Arrays.toString(array1), Arrays.toString(array2));
		} else {
			System.out.printf("%s y %s tienen su primera diferencia en el elemento %d\n", Arrays.toString(array1),
					Arrays.toString(array2), indexMismatch);
		}

		indexMismatch = Arrays.mismatch(array1, array3);

		if (indexMismatch == -1) {
			System.out.printf("%s y %s son iguales\n", Arrays.toString(array1), Arrays.toString(array3));
		} else {
			System.out.printf("%s y %s tienen su primera diferencia en el elemento %d\n", Arrays.toString(array1),
					Arrays.toString(array3), indexMismatch);
		}

		indexMismatch = Arrays.mismatch(array1, 2, 6, array3, 2, 6);

		if (indexMismatch == -1) {
			System.out.printf("%s y %s son iguales en el rango 2-5\n", Arrays.toString(array1),
					Arrays.toString(array3));
		} else {
			System.out.printf("%s y %s tienen su primera diferencia en el elemento %d en el rango 2-5\n",
					Arrays.toString(array1), Arrays.toString(array3), indexMismatch);
		}

	}

	public static void main(String[] args) {

		new Mismatch().show();

	}

}
