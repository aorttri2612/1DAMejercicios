package tema14_Streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Reduce {

	public void show() {

		OptionalInt integerSum;
			 
		integerSum = IntStream.of(30, 23, 24, 57, 8, 15)
				     .reduce((subtotal, element) -> subtotal + element);//Con lambda
		integerSum.ifPresent(System.out::println);//157
		
		integerSum = IntStream.of(30, 23, 24, 57, 8, 15)
					 .reduce(Integer::sum);//Con referencia a método
		integerSum.ifPresent(System.out::println);//157
		
		integerSum = IntStream.empty()
					 .reduce(Integer::sum);
		System.out.println(integerSum);//OptionalInt.empty
		integerSum.ifPresent(System.out::println);//No hace nada

	}

	public static void main(String[] args) {

		new Reduce().show();

	}

}
