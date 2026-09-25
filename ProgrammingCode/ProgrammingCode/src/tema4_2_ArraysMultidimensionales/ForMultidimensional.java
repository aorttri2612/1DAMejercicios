package tema4_2_ArraysMultidimensionales;

public class ForMultidimensional {

	public void show() {

		//Array de dos dimensiones [3][5]
		int[][] twoDimensions = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		//Array de tres dimensiones [2][3][2] 
		int[][][] threeDimensions = { { { 0, 1 }, { 2, 3 }, { 4, 5 } }, { { 6, 7 }, { 8, 9 }, { 10, 11 } } };

		for (int i = 0; i < twoDimensions.length; i++) {//Recorrido de arrays bidimensionales
			for (int j = 0; j < twoDimensions[i].length; j++) {
				System.out.printf("%2d ", twoDimensions[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < threeDimensions.length; i++) {//Recorrido de arrays tridimensionales
			for (int j = 0; j < threeDimensions[i].length; j++) {
				for (int k = 0; k < threeDimensions[i][j].length; k++) {
					System.out.printf("%2d ", threeDimensions[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		new ForMultidimensional().show();
	}

}
