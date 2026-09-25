package tema14_Streams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;
   
public class CollectorsReducingCombiner {

	public void show() {
		
		int count = Stream.of("Juan", "Pepe", "Luis", "Ricardo", "Laura")
					.collect(Collectors.reducing(0, element -> {
						if(element.length() % 2 == 0) {
							return 1;
						}
						else {
							return 0;
						}
					}, Integer::sum));	
		
		System.out.printf("Cuántos nombres con número de caracteres pares: %d", count);//3

	}

	public static void main(String[] args) {

		new CollectorsReducingCombiner().show();

	}

}
