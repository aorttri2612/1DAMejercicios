package tema14_Streams.collect;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsClassicDataStructures {

	public void show() {

		List<Integer> list = List.of(3, 6, 1, 2, 4, 5);
		list.stream()
			.filter(n -> n % 2 == 0)
			.collect(Collectors.toList())
			.forEach(System.out::println);
				
		list.stream()
		    .filter(n -> n % 2 == 0)
			.collect(Collectors.toCollection(TreeSet::new))
			.forEach(System.out::println);
		
	}

	public static void main(String[] args) {

		new CollectorsClassicDataStructures().show();

	}

}
