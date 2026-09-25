package tema14_Streams;

import java.util.stream.Stream;

public class ReduceCombiner {

	public void show() {
		
		int count = Stream.of("Juan", "Pepe", "Luis", "Ricardo", "Laura")
					.reduce(0,(subtotal,element) -> {
						if(element.length() % 2 == 0) {
							return subtotal + 1;
						}
						else {
							return subtotal;
						}
					}, Integer::sum);
		
		System.out.printf("Cuántos nombres con número de caracteres pares: %d", count);//3

	}

	public static void main(String[] args) {

		new ReduceCombiner().show();

	}

}