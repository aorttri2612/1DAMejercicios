package tema14_Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxMinAverage {

	public void show() {

		OptionalInt minEvenNumbers, maxEvenNumbers;
		OptionalDouble averageEvenNumbers;
		 
		minEvenNumbers = IntStream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.min();
		minEvenNumbers.ifPresent(System.out::println);//8
		
		maxEvenNumbers = IntStream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.max();
		maxEvenNumbers.ifPresent(System.out::println);//30
		
		averageEvenNumbers = IntStream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.average();
		averageEvenNumbers.ifPresent(n -> System.out.printf("%.2f", n));//20,67

	}

	public static void main(String[] args) {

		new MaxMinAverage().show();

	}

}
