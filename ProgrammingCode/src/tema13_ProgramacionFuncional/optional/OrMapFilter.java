package tema13_ProgramacionFuncional.optional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

public class OrMapFilter {

	public void show() {

		List<Integer> list1 = List.of(3, 2, 6, 1, 5, 4);
		List<Integer> list2 = new ArrayList<>();
		Optional<Integer> maximumOptional1 = max(list1);
		Optional<Integer> maximumOptional2 = max(list2);
		Optional<Integer> maximumOptional3, maximumOptional4, maximumOptional5;

		maximumOptional3 = maximumOptional1.or(() -> Optional.of(obtainRandomNumber()));
		maximumOptional4 = maximumOptional2.or(() -> Optional.of(obtainRandomNumber()));
		System.out.println(maximumOptional3);//Optional[6]
		System.out.println(maximumOptional4);//Optional de un número aleatorio

		maximumOptional3 = maximumOptional1.map(n -> n * 2);
		maximumOptional4 = maximumOptional2.map(n -> n * 2);
		System.out.println(maximumOptional3);//Optional[12]
		System.out.println(maximumOptional4);//Optional.empty

		maximumOptional3 = maximumOptional1.filter(n -> n % 2 == 0);
		maximumOptional4 = maximumOptional1.filter(n -> n % 2 != 0);
		maximumOptional5 = maximumOptional2.filter(n -> n % 2 == 0);
		System.out.println(maximumOptional3);//Optional[6]
		System.out.println(maximumOptional4);//Optional.empty
		System.out.println(maximumOptional5);//Optional.empty

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

		new OrMapFilter().show();

	}

}
