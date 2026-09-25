package tema14_Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Find {

	public void show() {

		Optional<Integer> find;
		find = Stream.of(1, 2, 4)
			   .filter(n -> n % 2 == 0)
			   .findFirst();		
		find.ifPresent(System.out::println);//2
		
		find = Stream.of(6, 2, 4)
			   .filter(n -> n % 2 == 0)
			   .findAny();		
		find.ifPresent(System.out::println);//6
		
	}

	public static void main(String[] args) {

		new Find().show();

	}

}
