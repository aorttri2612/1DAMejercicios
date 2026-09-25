package tema12_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShowIterator {

	public void show() {

		Iterator<String> it;
		List<String> list = new ArrayList<>();

		list.add("Juan");
		list.add("Antonio");
		list.add("Jaime");
		list.add("Vicente");

		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {

		new ShowIterator().show();

	}

}
