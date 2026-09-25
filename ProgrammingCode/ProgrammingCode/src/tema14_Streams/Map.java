package tema14_Streams;

import java.util.stream.Stream;

public class Map {

	public void show() {

		Stream.of(20, 27, 31)
	    .map(n -> "Número " + n)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Map().show();

	}

}
