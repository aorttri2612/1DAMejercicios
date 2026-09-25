package tema14_Streams;

import java.util.stream.Stream;

public class Count {

	public void show() {

		long howManyAreEven; 
		howManyAreEven = Stream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 == 0)
						.count();
		System.out.println(howManyAreEven);//3

	}

	public static void main(String[] args) {

		new Count().show();

	}

}
