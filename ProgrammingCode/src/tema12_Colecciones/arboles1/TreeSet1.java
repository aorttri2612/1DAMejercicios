package tema12_Colecciones.arboles1;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {

	public void show() {

		SortedSet<Vehicle> tree = new TreeSet<>();
		tree.add(new Vehicle("9685KMX", 4, "azul"));
		tree.add(new Vehicle("1235GTR", 2, "rojo"));
		tree.add(new Vehicle("7314QWE", 4, "verde"));
		tree.add(new Vehicle("5930POI", 2, "negro"));
		tree.add(new Vehicle("1705UBG", 4, "blanco"));
		tree.add(new Vehicle("3495JZA", 2, "naranja"));
		for (Vehicle v : tree) {
			System.out.println(v);
		}

	}

	public static void main(String[] args) {

		new TreeSet1().show();

	}

}
