package tema12_Colecciones.arboles3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CompareBoxedClasses {

	public void show() {

		SortedSet<Vehicle> tree = new TreeSet<>(new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				int result = Integer.compare(o1.getWheelCount(), o2.getWheelCount());
				if (result == 0) {
					result = Double.compare(o1.getSpeed(), o2.getSpeed());
				}
				return result;
			}

		});
		Vehicle vehicles[] = new Vehicle[6];
		vehicles[0] = new Vehicle("9685KMX", 4, "azul");
		vehicles[0].accelerate(100);
		vehicles[1] = new Vehicle("1235GTR", 2, "rojo");
		vehicles[1].accelerate(150);
		vehicles[2] = new Vehicle("7314QWE", 4, "verde");
		vehicles[2].accelerate(200);
		vehicles[3] = new Vehicle("5930POI", 2, "negro");
		vehicles[3].accelerate(80);
		vehicles[4] = new Vehicle("1705UBG", 4, "blanco");
		vehicles[4].accelerate(75);
		vehicles[5] = new Vehicle("3495JZA", 2, "naranja");
		vehicles[5].accelerate(170);

		for (int i = 0; i < vehicles.length; i++) {
			tree.add(vehicles[i]);
		}
		for (Vehicle v : tree) {
			System.out.println(v);
		}

	}

	public static void main(String[] args) {

		new CompareBoxedClasses().show();

	}

}
