package tema13_ProgramacionFuncional.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThenComparingFunction {

	public void show() {

		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle("1705UBG", 4, "blanco"));
		list.add(new Vehicle("9685KMX", 4, "azul"));
		list.add(new Vehicle("1235GTR", 2, "rojo"));
		list.add(new Vehicle("7314QWE", 4, "verde"));
		list.add(new Vehicle("3495JZA", 2, "blanco"));
		list.add(new Vehicle("5930POI", 2, "negro"));
		list.sort(Comparator.comparing(Vehicle::getColour).thenComparing(Vehicle::getWheelCount));
		list.forEach(System.out::println);

	}

	public static void main(String[] args) {

		new ThenComparingFunction().show();

	}

}
