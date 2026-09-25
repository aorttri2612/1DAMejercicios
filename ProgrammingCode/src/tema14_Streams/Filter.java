package tema14_Streams;

import java.util.stream.Stream;

public class Filter {

	public void show() {

		Stream.of(9, 12, 15, 24, 37, 6)
	    .filter(n -> n % 2 == 0)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Filter().show();

	}

}
