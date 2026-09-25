package tema13_ProgramacionFuncional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NullsFirst {

	public void show() {

		List<Integer> list = Arrays.asList(3, 2, null, 6, 1, 5, 4, null);
		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		System.out.println("nullsFirst:");
		list.forEach(System.out::println);
		list.sort(Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println("nullsLast:");
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new NullsFirst().show();

	}

}
