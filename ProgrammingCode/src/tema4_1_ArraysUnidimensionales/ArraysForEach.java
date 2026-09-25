package tema4_1_ArraysUnidimensionales;

public class ArraysForEach {

	public void show() {

		int[] grades = { 8, 7, 9 };

		for (int grade : grades) {
			System.out.printf("Nota: %d\n", grade);
		}

	}

	public static void main(String[] args) {

		new ArraysForEach().show();

	}

}
