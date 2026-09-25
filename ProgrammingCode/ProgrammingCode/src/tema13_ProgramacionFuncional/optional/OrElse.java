package tema13_ProgramacionFuncional.optional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

public class OrElse {

	public void show() {

		List<Integer> list1 = List.of(3, 2, 6, 1, 5, 4);
		List<Integer> list2 = new ArrayList<>();
		Optional<Integer> maximumOptional1 = max(list1);
		Optional<Integer> maximumOptional2 = max(list2);
		Integer maximum1, maximum2;

		maximum1 = maximumOptional1.orElse(0);
		maximum2 = maximumOptional2.orElse(0);
		System.out.println(maximum1);//6
		System.out.println(maximum2);//0

		maximum1 = maximumOptional1.orElseGet(() -> obtainRandomNumber());
		maximum2 = maximumOptional2.orElseGet(() -> obtainRandomNumber());
		System.out.println(maximum1);//6
		System.out.println(maximum2);//Número aleatorio entre 1 y 10

		maximum1 = maximumOptional1.orElseThrow();
		System.out.println(maximum1);//6
		try {
			maximum2 = maximumOptional2.orElseThrow();
		} catch (NoSuchElementException e) {
			System.err.println("Valor no presente");
		}

		maximum1 = maximumOptional1.orElseThrow(IllegalStateException::new);
		System.out.println(maximum1);//6
		try {
			maximum2 = maximumOptional2.orElseThrow(IllegalStateException::new);
		} catch (IllegalStateException e) {
			System.err.println("Valor no presente");
		}

	}

	public Integer obtainRandomNumber() {
		return new Random().nextInt(10) + 1;//Devuelve un número aleatorio entre 1 y 10
	}

	public static <T extends Comparable<T>> Optional<T> max(Collection<? extends T> coll) {
		try {
			return Optional.of(Collections.max(coll));
		} catch (NoSuchElementException e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

		new OrElse().show();

	}

}
