package tema14_Streams.collect;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsGroupingByMapping {

	public void show() {

		Vehicle vehicles[] = new Vehicle[6];
		vehicles[0] = new Vehicle("7314QWE", 4, "verde");
		vehicles[1] = new Vehicle("9685KMX", 2, "azul");
		vehicles[2] = new Vehicle("1235GTR", 2, "rojo");
		vehicles[3] = new Vehicle("5930POI", 2, "negro");
		vehicles[4] = new Vehicle("1705UBG", 4, "blanco");
		vehicles[5] = new Vehicle("3495JZA", 2, "naranja");
		Arrays.stream(vehicles)
			  .collect(Collectors.groupingBy(Vehicle::getWheelCount, TreeMap::new,
					   						 Collectors.mapping(Vehicle::getRegistration, 
					   								 			Collectors.joining(" - "))))
			  .forEach((k, v) -> System.out.printf("Matrículas con %d ruedas: %s\n", k, v));		
	}

	public static void main(String[] args) {

		new CollectorsGroupingByMapping().show();

	}

}
