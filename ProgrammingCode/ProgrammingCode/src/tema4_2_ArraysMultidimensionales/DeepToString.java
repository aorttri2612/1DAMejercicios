package tema4_2_ArraysMultidimensionales;

import java.util.Arrays;

public class DeepToString {

	public void show() {

		int[][] twoDimensions = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		System.out.println(Arrays.deepToString(twoDimensions));
		//[[0, 1, 2, 3, 4], [5, 6, 7, 8, 9], [10, 11, 12, 13, 14]]

	}

	public static void main(String[] args) {

		new DeepToString().show();

	}

}
