package tema13_ProgramacionFuncional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrder {

	public void show() {

		List<Integer> list = Arrays.asList(3, 2, 6, 1, 5, 4);
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new ReverseOrder().show();

	}

}
