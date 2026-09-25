package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Sort {

	public void show() {

		int[] array1 = { 8, 4, 3, 7, 5, 6 };
		int[] array2 = { 8, 4, 3, 7, 5, 6 };

		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));//[3, 4, 5, 6, 7, 8]

		Arrays.sort(array2, 1, 5);
		System.out.println(Arrays.toString(array2));//[8, 3, 4, 5, 7, 6]

	}

	public static void main(String[] args) {

		new Sort().show();

	}

}
