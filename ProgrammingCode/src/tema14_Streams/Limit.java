package tema14_Streams;

import java.util.stream.Stream;

public class Limit {

	public void show() {

		Stream.of("Ricardo", "Luis", "Paco")
		.limit(2)
		.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Limit().show();

	}

}
