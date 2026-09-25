package tema13_ProgramacionFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {

	public void show() {

		List<Integer> list = List.of(3, 2, 6, 1, 5, 4);
		List<Integer> listCopy = new ArrayList<>();
		Consumer<Integer> copy = listCopy::add;
		Consumer<Integer> show = System.out::println;
		list.forEach(copy.andThen(show));
		listCopy.forEach(show);

	}

	public static void main(String[] args) {

		new ConsumerAndThen().show();

	}

}
