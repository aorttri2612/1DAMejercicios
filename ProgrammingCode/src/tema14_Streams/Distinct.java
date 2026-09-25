package tema14_Streams;

import java.util.stream.Stream;

public class Distinct {

	public void show() {

		Stream.of(1, 3, 2, 3, 1)
	    .distinct()
	    .forEach(System.out::println);

	}

	public static void main(String[] args) {

		new Distinct().show();

	}

}
