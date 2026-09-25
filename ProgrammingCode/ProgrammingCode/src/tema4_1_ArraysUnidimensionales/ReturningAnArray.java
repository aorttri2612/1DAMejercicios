package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class ReturningAnArray {

	public void show() {

		int[] a;
		a = method();
		System.out.println(Arrays.toString(a));//[3, 4, 5, 6, 7, 8]

	}

	public int[] method() {

		int[] array = { 3, 4, 5, 6, 7, 8 };

		return array;

	}

	public static void main(String[] args) {

		new ReturningAnArray().show();

	}

}
