package tema4_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Comparison {

	public void show() {

		int[] array1;
		int[] array2 = { 3, 4, 5, 6, 7, 8 };
		int[] array3 = { 3, 4, 5, 6, 7, 8 };
		array1 = array2;
		System.out.println(array1 == array2);//true porque apuntan al mismo array
		System.out.println(array2 == array3);//false porque no apuntan al mismo array
		System.out.println(array1.equals(array2));//true porque apuntan al mismo array
		System.out.println(array2.equals(array3));//false porque no apuntan al mismo array
		System.out.println(Arrays.equals(array1, array2));//true porque el contenido es el mismo ya que apuntan al mismo array
		System.out.println(Arrays.equals(array2, array3));//true porque el contenido es el mismo		

	}

	public static void main(String[] args) {

		new Comparison().show();

	}

}
