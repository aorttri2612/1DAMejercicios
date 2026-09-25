package tema14_Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedReverseOrder {

	public void show() {

		Stream.of("Ricardo", "Luis", "Paco")
		.sorted(Comparator.reverseOrder())
		.limit(2)
		.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new SortedReverseOrder().show();

	}

}
