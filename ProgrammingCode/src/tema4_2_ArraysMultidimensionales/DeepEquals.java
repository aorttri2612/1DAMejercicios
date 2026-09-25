package tema4_2_ArraysMultidimensionales;

import java.util.Arrays;

public class DeepEquals {

	public void show() {

		int[][] array1 = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		int[][] array2 = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		int[][] array3 = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 15 } };

		System.out.printf("%s\n y\n%s\n%s iguales\n\n", Arrays.deepToString(array1), Arrays.deepToString(array2),
				Arrays.deepEquals(array1, array2) ? "son" : "no son");
		System.out.printf("%s\n y\n%s\n%s iguales\n", Arrays.deepToString(array1), Arrays.deepToString(array3),
				Arrays.deepEquals(array1, array3) ? "son" : "no son");

	}

	public static void main(String[] args) {

		new DeepEquals().show();

	}

}
