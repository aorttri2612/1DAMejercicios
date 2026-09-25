package tema12_Colecciones;

import java.util.ArrayList;
import java.util.List;

public class ModifyInsideForEach {

	public void show() {

		List<String> list = new ArrayList<>();

		list.add("Juan");
		list.add("Antonio");
		list.add("Jaime");
		list.add("Vicente");
		for (String s : list) {//Se lanza en ejecución la excepción ConcurrentModificationException
			System.out.printf(" %s ", s);
			if (s.equals("Antonio")) {
				list.remove("Antonio");
			}
		}

	}

	public static void main(String[] args) {

		new ModifyInsideForEach().show();

	}

}
