package tema14_Streams;

import java.util.stream.IntStream;

public class Match {

	public void show() {

		boolean match; 
		match = IntStream.of(1, 2, 4)
				.allMatch(n -> n % 2 == 0);		
		System.out.println(match);//false
		
		match = IntStream.of(2, 4, 6)
				.allMatch(n -> n % 2 == 0);		
		System.out.println(match);//true
		
		match = IntStream.of(1, 2, 4)
				.noneMatch(n -> n % 2 == 0);		
		System.out.println(match);//false
		
		match = IntStream.of(1, 3, 5)
				.noneMatch(n -> n % 2 == 0);		
		System.out.println(match);//true
		
		match = IntStream.of(1, 3, 5)
				.anyMatch(n -> n % 2 == 0);		
		System.out.println(match);//false
		
		match = IntStream.of(2, 3, 5)
				.anyMatch(n -> n % 2 == 0);		
		System.out.println(match);//true

	}

	public static void main(String[] args) {

		new Match().show();

	}

}
