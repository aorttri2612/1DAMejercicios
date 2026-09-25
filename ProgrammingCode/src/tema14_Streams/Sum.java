package tema14_Streams;

import java.util.stream.IntStream;

public class Sum {

	public void show() {

		int sumEvenNumbers; 
		sumEvenNumbers = IntStream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.sum();
		System.out.println(sumEvenNumbers);//62

	}

	public static void main(String[] args) {

		new Sum().show();

	}

}
