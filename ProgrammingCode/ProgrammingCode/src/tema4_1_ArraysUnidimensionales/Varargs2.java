package tema4_1_ArraysUnidimensionales;

public class Varargs2 {

	public void show() {

		System.out.println(operate(2));
		System.out.println(operate(2, 1));
		System.out.println(operate(2, 1, 2));
		System.out.println(operate(2, 1, 2, 3));
		System.out.println(operate(2, 1, 2, 3, 4));

	}

	public int operate(int mult, int... summands) {

		int sum = 0;

		for (int i = 0; i < summands.length; i++) {
			sum += summands[i];
		}
		return sum * mult;
	}

	public static void main(String[] args) {

		new Varargs2().show();

	}

}
