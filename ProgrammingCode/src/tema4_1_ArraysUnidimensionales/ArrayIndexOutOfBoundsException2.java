package tema4_1_ArraysUnidimensionales;

public class ArrayIndexOutOfBoundsException2 {

	public void show() {

		int[] grades = { 8, 7, 9 };

		try {
			for (int i = 0; i <= grades.length; i++) {
				System.out.printf("Nota en el índice %d: %d\n", i, grades[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {//Esto no se debe hacer
			System.err.println("Esto no se debe hacer");
		}

	}

	public static void main(String[] args) {

		new ArrayIndexOutOfBoundsException2().show();

	}

}
