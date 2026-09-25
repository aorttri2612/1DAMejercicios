package tema4_2_ArraysMultidimensionales;

public class ArraysForEachThreeDimensions {

	public void show() {

		//Array de tres dimensiones [2][3][2] 

        int[][][] threeDimensions = { { { 0, 1 }, { 2, 3 }, { 4, 5 } }, { { 6, 7 }, { 8, 9 }, { 10, 11 } } };
				
		for (int[][] twoDimensions : threeDimensions) {
            for (int[] oneDimensions : twoDimensions) {
            	for(int number: oneDimensions) {
            		System.out.printf("%d ", number);
            	}
            	System.out.println();
            }
            System.out.println();
        }
		
	}

	public static void main(String[] args) {

		new ArraysForEachThreeDimensions().show();

	}

}
