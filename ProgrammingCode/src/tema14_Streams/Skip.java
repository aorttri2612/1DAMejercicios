package tema14_Streams;

import java.util.stream.Stream;

public class Skip {

	public void show() {

		Stream.of(9, 12, 15, 24, 37, 6)
	    .skip(3)
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Skip().show();

	}

}
