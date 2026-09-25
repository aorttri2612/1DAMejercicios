package tema4_2_ArraysMultidimensionales;

import java.util.Arrays;

public class ComparisonMultidimensional {

	public void show() {

		int[][] twoDimensions1;

		int[][] twoDimensions2 = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		int[][] twoDimensions3 = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		twoDimensions1 = twoDimensions2;

		System.out.println(twoDimensions1 == twoDimensions2);//true porque apuntan al mismo array
		System.out.println(twoDimensions2 == twoDimensions3);//false porque no apuntan al mismo array
		System.out.println(twoDimensions1.equals(twoDimensions2));//true porque apuntan al mismo array
		System.out.println(twoDimensions2.equals(twoDimensions3));//false porque no apuntan al mismo array
		System.out.println(Arrays.deepEquals(twoDimensions1, twoDimensions2));//true porque el contenido es el mismo ya que apuntan al mismo array
		System.out.println(Arrays.deepEquals(twoDimensions2, twoDimensions3));//true porque el contenido es el mismo
		System.out.println(Arrays.equals(twoDimensions2, twoDimensions3));//false porque para arrays multidimensionales es DeepEquals en lugar de equals

	}

	public static void main(String[] args) {

		new ComparisonMultidimensional().show();

	}

}
