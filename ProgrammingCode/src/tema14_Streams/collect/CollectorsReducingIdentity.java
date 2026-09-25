package tema14_Streams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReducingIdentity {

	public void show() {

		Integer sum,mult;
			 
		sum = Stream.of(30, 23, 24, 57, 8, 15)
			  .collect(Collectors.reducing(0, Integer::sum));
		System.out.println(sum);//157
		
		sum = Stream.<Integer>empty()
			  .collect(Collectors.reducing(0, Integer::sum));
		System.out.println(sum);//0
		
		mult = Stream.of(2,3,4)
			   .collect(Collectors.reducing(1, Math::multiplyExact));
		System.out.println(mult);//24
			
		mult = Stream.<Integer>empty()
			   .collect(Collectors.reducing(1, Math::multiplyExact));
		System.out.println(mult);//1

	}

	public static void main(String[] args) {

		new CollectorsReducingIdentity().show();

	}

}
