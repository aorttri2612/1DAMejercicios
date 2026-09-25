package tema14_Streams.collect;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReducing {

	public void show() {

		Optional<Integer> integerSum;
			 
		integerSum = Stream.of(30, 23, 24, 57, 8, 15)
					 .collect(Collectors.reducing((subtotal, element) -> subtotal + element));//Con lambda
		integerSum.ifPresent(System.out::println);//157
		
		integerSum = Stream.of(30, 23, 24, 57, 8, 15)
					 .collect(Collectors.reducing(Integer::sum));//Con referencia a método
		integerSum.ifPresent(System.out::println);//157

		integerSum = Stream.<Integer>empty()
				    .collect(Collectors.reducing(Integer::sum));//Optional.empty
		integerSum.ifPresent(System.out::println);//No hace nada

	}

	public static void main(String[] args) {

		new CollectorsReducing().show();

	}

}
