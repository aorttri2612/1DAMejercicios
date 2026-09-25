package tema12_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NextException {

	public void show() {

		Iterator<String> it;
		List<String> list = new ArrayList<>();

		list.add("Juan");
		it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());//Se lanza en ejecución una excepción NoSuchElementException

	}

	public static void main(String[] args) {

		new NextException().show();

	}

}
