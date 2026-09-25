package tema14_Streams;

import java.util.stream.Stream;

public class DropWhile {

	public void show() {

		Stream.of(9, 13, 15, 24, 37, 6)
	    .dropWhile(n -> n % 2 != 0)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new DropWhile().show();

	}

}
