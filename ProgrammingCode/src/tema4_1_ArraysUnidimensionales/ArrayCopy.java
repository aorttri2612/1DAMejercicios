package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class ArrayCopy {

	public void show() {

		int[] origin = {1, 2, 3, 4, 5, 6};
		int[] destination = {10, 20, 30, 40, 50, 60};
		
		System.arraycopy(origin, 2, destination, 1, 3);
		System.out.println(Arrays.toString(destination));//[10, 3, 4, 5, 50, 60]

	}

	public static void main(String[] args) {

		new ArrayCopy().show();

	}

}
