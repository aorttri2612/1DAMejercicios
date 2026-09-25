package tema13_ProgramacionFuncional.optional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class GetAndIsPresent {

	public void show() {

		List<Integer> list1 = List.of(3, 2, 6, 1, 5, 4);
		List<Integer> list2 = new ArrayList<>();
		Optional<Integer> maximumOptional1 = max(list1);
		Optional<Integer> maximumOptional2 = max(list2);
		Integer maximum1 = 0, maximum2;

		if (maximumOptional1.isPresent()) {
			maximum1 = maximumOptional1.get();
		}
		System.out.println(maximumOptional1);//Optional[6]
		System.out.println(maximum1);//6

		maximum2 = maximumOptional2.isPresent() ? maximumOptional2.get() : 0;
		System.out.println(maximumOptional2);//Optional.empty
		System.out.println(maximum2);//0

	}

	public static <T extends Comparable<T>> Optional<T> max(Collection<? extends T> coll) {
		try {
			return Optional.of(Collections.max(coll));
		} catch (NoSuchElementException e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

		new GetAndIsPresent().show();

	}

}
