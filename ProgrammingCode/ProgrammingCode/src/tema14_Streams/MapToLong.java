package tema14_Streams;

import java.util.stream.Stream;

public class MapToLong {

	public void show() {

		Stream.of(55000, 60000, 72500)
	    .mapToLong(n -> (long)n * n)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new MapToLong().show();

	}

}
