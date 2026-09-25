package tema14_Streams;

import java.util.stream.Stream;

public class MapToDouble {

	public void show() {

		Stream.of(20, 27, 31)
	    .mapToDouble(n -> n * 0.5)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new MapToDouble().show();

	}

}
