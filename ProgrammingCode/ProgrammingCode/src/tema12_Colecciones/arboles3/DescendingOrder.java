package tema12_Colecciones.arboles3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DescendingOrder {

	public void show() {

		SortedSet<Vehicle> tree = new TreeSet<>(new Comparator<Vehicle>() {

			/*
			 * Si quisiéramos ordenar de manera descendente, 
			 * cambiamos el orden entre o1 y o2, es decir, 
			 * hacemos que sea o2 el que ejecute el compareTo
			 */
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				int result = o2.getColour().compareTo(o1.getColour());
				if (result == 0) {
					result = o2.getRegistration().compareTo(o1.getRegistration());
				}
				return result;
			}

		});

		tree.add(new Vehicle("9685KMX", 4, "azul"));
		tree.add(new Vehicle("1235GTR", 2, "rojo"));
		tree.add(new Vehicle("7314QWE", 4, "verde"));
		tree.add(new Vehicle("5930POI", 2, "azul"));
		tree.add(new Vehicle("1705UBG", 4, "rojo"));
		tree.add(new Vehicle("3495JZA", 2, "verde"));
		for (Vehicle v : tree) {
			System.out.println(v);
		}

	}

	public static void main(String[] args) {

		new DescendingOrder().show();

	}

}
