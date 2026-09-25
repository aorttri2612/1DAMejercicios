package tema14_Streams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoining {

	public void show() {
		
		String result = Stream.of("Juan", "Pepe", "Luis", "Ricardo", "Laura")
					    .collect(Collectors.joining());
		System.out.println(result);

	}

	public static void main(String[] args) {

		new CollectorsJoining().show();

	}

}