package tema14_Streams.collect;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing {

	public void show() {

		IntSummaryStatistics oddStatistics;
		oddStatistics = Stream.of(30, 23, 24, 57, 8, 15)
						.filter(n -> n % 2 != 0)
						.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(oddStatistics);

	}

	public static void main(String[] args) {

		new Summarizing().show();

	}

}
