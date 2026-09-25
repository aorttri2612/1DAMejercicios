package tema12_Colecciones.arboles3;

import java.util.SortedSet;
import java.util.TreeSet;

public class ShowComparator {

	public void show() {

		SortedSet<Vehicle> tree = new TreeSet<>(new VehicleComparator());
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

		new ShowComparator().show();

	}

}
