package tema13_ProgramacionFuncional;

import java.util.List;

public class InterfaceConsumer {

	public void show() {

		List<Integer> list = List.of(3, 2, 6, 1, 5, 4);
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new InterfaceConsumer().show();

	}

}
