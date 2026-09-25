package tema14_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {

	public void show() {

		Stream.of(1, 2, 3)
	    .flatMap(n -> IntStream.rangeClosed(1, n).boxed())
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new FlatMap().show();

	}

}
