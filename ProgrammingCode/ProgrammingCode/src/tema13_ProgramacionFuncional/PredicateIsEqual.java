package tema13_ProgramacionFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateIsEqual {

	public void show() {

		List<Integer> list = new ArrayList<>(List.of(5, 3, 2, 5, 6, 1, 5, 4));
		list.removeIf(Predicate.isEqual(5));
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new PredicateIsEqual().show();

	}

}
