package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class CopyOfRange {

	public void show() {

		int[] array1 = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = Arrays.copyOfRange(array1, 2, 6);
		System.out.println(Arrays.toString(array2));//[5, 6, 7, 8]

	}

	public static void main(String[] args) {

		new CopyOfRange().show();

	}

}
