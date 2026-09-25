package tema14_Streams;

import java.util.stream.Stream;

public class MapToInt {

	public void show() {

		Stream.of("Ricardo", "Luis Miguel", "Paco")
	    .mapToInt(n -> n.length())
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new MapToInt().show();

	}

}
