package tema4_2_ArraysMultidimensionales;

public class LengthMultidimensional {

	public void show() {

		//Array de dos dimensiones [3][5]
		int[][] twoDimensions = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		//Array de tres dimensiones [2][3][2] 
		int[][][] threeDimensions = { { { 0, 1 }, { 2, 3 }, { 4, 5 } }, { { 6, 7 }, { 8, 9 }, { 10, 11 } } };

		System.out.println(twoDimensions.length);//3
		System.out.println(twoDimensions[0].length);//5
		System.out.println(twoDimensions[1].length);//5
		System.out.println(twoDimensions[2].length);//5

		System.out.println(threeDimensions.length);//2
		System.out.println(threeDimensions[0].length);//3
		System.out.println(threeDimensions[1].length);//3
		System.out.println(threeDimensions[0][0].length);//2
		System.out.println(threeDimensions[1][2].length);//2
		System.out.println(threeDimensions[1][2][0].length); //Error de compilación

	}

	public static void main(String[] args) {

		new LengthMultidimensional().show();

	}

}
