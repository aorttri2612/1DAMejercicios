package tema14_Streams.collect;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMax {

	public void show() {

		Optional<Integer> min,max;
		List<Integer> list = List.of(30, 23, 24, 57, 8, 15);
		min = list.stream()
			  .collect(Collectors.minBy(Comparator.naturalOrder()));
		min.ifPresent(System.out::println);//8
		
		max = list.stream()
			  .collect(Collectors.maxBy(Comparator.naturalOrder()));
		max.ifPresent(System.out::println);//57

	}

	public static void main(String[] args) {

		new CollectorsMinMax().show();

	}

}
