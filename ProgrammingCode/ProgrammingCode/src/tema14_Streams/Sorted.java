package tema14_Streams;

import java.util.stream.Stream;

public class Sorted {

	public void show() {

		Stream.of("Ricardo", "Luis", "Paco")
		.sorted()
		.limit(2)
		.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Sorted().show();

	}

}
