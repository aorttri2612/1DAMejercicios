package tema14_Streams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsCounting {

	public void show() {

		long howManyAreEven; 
		howManyAreEven = Stream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.collect(Collectors.counting());
		System.out.println(howManyAreEven);//3

	}

	public static void main(String[] args) {

		new CollectorsCounting().show();

	}

}
