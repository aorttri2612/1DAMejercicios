package tema14_Streams.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveraging {

	public void show() {

		double average;
		List<Integer> list = List.of(30, 23, 24, 57, 8, 15);
		average = list.stream()
				  .collect(Collectors.averagingInt(Integer::intValue));
		System.out.printf("%.2f",average);//26,17
		
	}

	public static void main(String[] args) {

		new CollectorsAveraging().show();

	}

}
