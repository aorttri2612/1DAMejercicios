package tema4_2_ArraysMultidimensionales;

public class ArraysForEachTwoDimensions {

	public void show() {

		//Array de dos dimensiones [3][5]
		int[][] twoDimensions = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };
		//Recorrido del segundo array unidimensional del array bidimensional:
		for (int number : twoDimensions[1]) {
			System.out.printf("%d ", number);//5 6 7 8 9
		}
		System.out.println();
		
		// Bucle for-each para recorrer el array bidimensional
        for (int[] oneDimensions : twoDimensions) {
            // Bucle for-each para recorrer cada subarray unidimensional
            for (int number : oneDimensions) {
            	System.out.printf("%d ", number);
            }
            System.out.println();
        }
		
	}

	public static void main(String[] args) {

		new ArraysForEachTwoDimensions().show();

	}

}
