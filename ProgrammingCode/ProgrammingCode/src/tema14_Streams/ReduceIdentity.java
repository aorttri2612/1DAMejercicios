package tema14_Streams;

import java.util.stream.IntStream;

public class ReduceIdentity {

	public void show() {

		Integer sum,mult;
			 
		sum = IntStream.of(30, 23, 24, 57, 8, 15)
		      .reduce(0, Integer::sum);
		System.out.println(sum);//157
		
		sum = IntStream.empty()
		      .reduce(0, Integer::sum);
		System.out.println(sum);//0
		
		mult = IntStream.of(2,3,4)
		       .reduce(1, (subtotal,element) -> subtotal * element);//Con lambda
		System.out.println(mult);//24
		
		mult = IntStream.of(2,3,4)
		       .reduce(1, Math::multiplyExact);//Con referencia a método
		System.out.println(mult);//24
			
		mult = IntStream.empty()
		      .reduce(1, Math::multiplyExact);
		System.out.println(mult);//1

	}

	public static void main(String[] args) {

		new ReduceIdentity().show();

	}

}
