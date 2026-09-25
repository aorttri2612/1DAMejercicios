package tema13_ProgramacionFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateComposition {

	public void show() {

		List<Integer> list = new ArrayList<>(List.of(3, 2, 6, 1, 5, 4));
		Predicate<Integer> esPar = n -> n % 2 == 0;
		Predicate<Integer> mayorQue3 = n -> n > 3;
		list.removeIf(esPar.and(mayorQue3));
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new PredicateComposition().show();

	}

}
