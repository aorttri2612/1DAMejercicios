package tema14_Streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LastReduce {

	public void show() {

		OptionalInt last;
			 
		last = IntStream.of(30, 23, 24, 57, 8, 15)
				     .reduce((first, second) -> second);
		last.ifPresent(System.out::println);//15
		
	}

	public static void main(String[] args) {

		new LastReduce().show();

	}

}
