package tema14_Streams;

import java.util.stream.Stream;

public class SumMapToInt {

	public void show() {

		int sumEvenNumbers; 
		sumEvenNumbers = Stream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.mapToInt(n -> n)
						.sum();
		System.out.println(sumEvenNumbers);//62

	}

	public static void main(String[] args) {

		new SumMapToInt().show();

	}

}
