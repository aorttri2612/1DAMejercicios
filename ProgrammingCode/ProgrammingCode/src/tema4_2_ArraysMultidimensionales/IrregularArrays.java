package tema4_2_ArraysMultidimensionales;

public class IrregularArrays {

	public void show() {

		int[][] b = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%2d ", b[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		new IrregularArrays().show();

	}

}
