package tema14_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToInt {

	public void show() {

		Stream.of(1, 2, 3)
	    .flatMapToInt(n -> IntStream.rangeClosed(1, n))
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new FlatMapToInt().show();

	}

}
