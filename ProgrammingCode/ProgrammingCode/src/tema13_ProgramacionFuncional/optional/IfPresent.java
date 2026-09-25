package tema13_ProgramacionFuncional.optional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class IfPresent {

	public void show() {

		List<Integer> list1 = List.of(3, 2, 6, 1, 5, 4);
		List<Integer> list2 = new ArrayList<>();
		Optional<Integer> maximumOptional1 = max(list1);
		Optional<Integer> maximumOptional2 = max(list2);
		maximumOptional1.ifPresent(System.out::println);//6
		maximumOptional2.ifPresent(System.out::println);//No hace nada

		maximumOptional1.ifPresentOrElse(System.out::println,
				() -> System.out.println("No hay máximo porque la lista está vacía"));//6
		maximumOptional2.ifPresentOrElse(System.out::println,
				() -> System.out.println("No hay máximo porque la lista está vacía"));//No hay máximo porque la lista está vacía

	}

	public static <T extends Comparable<T>> Optional<T> max(Collection<? extends T> coll) {
		try {
			return Optional.of(Collections.max(coll));
		} catch (NoSuchElementException e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

		new IfPresent().show();

	}

}
