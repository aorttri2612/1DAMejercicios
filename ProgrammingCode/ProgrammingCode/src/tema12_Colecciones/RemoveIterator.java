package tema12_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIterator {

	public void show() {

		String s;
		Iterator<String> it;
		List<String> list = new ArrayList<>();

		list.add("Juan");
		list.add("Antonio");
		list.add("Jaime");
		list.add("Vicente");

		it = list.iterator();
		while (it.hasNext()) {
			s = it.next();
			if (s.equals("Antonio")) {
				it.remove();
			} else {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		new RemoveIterator().show();

	}

}
