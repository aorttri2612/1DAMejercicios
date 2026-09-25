package tema11_Genericos;

public class MainGenNumeric {

	public void show() {

		GenNumeric<Integer> genInteger;
		GenNumeric<Double> genDouble;

		genInteger = new GenNumeric<Integer>(80);
		genDouble = new GenNumeric<Double>(78.63);

		System.out.printf("La parte decimal de %s es %.2f\n", genInteger.getAttribute(), genInteger.fraction());
		System.out.printf("La parte decimal de %s es %.2f\n", genDouble.getAttribute(), genDouble.fraction());
		
	}

	public static void main(String[] args) {

		new MainGenNumeric().show();

	}

}
