package tema14_Streams;

import java.util.List;
import java.util.Optional;

public class LastElement {

	public void show() {

		List<Integer> list = List.of(30, 23, 24, 57, 8, 15);
		long count = list.stream().count();
		Optional<Integer> last = list.stream()
								 .skip(count - 1)
								 .findFirst();
		last.ifPresent(System.out::println);//15		
		
	}

	public static void main(String[] args) {

		new LastElement().show();

	}

}
