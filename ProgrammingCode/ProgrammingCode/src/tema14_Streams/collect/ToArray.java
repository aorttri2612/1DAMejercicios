package tema14_Streams.collect;

import java.util.ArrayList;
import java.util.List;

public class ToArray {

	public void show() {

		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle("9685KMX", 4, "azul"));
		list.add(new Vehicle("1235GTR", 2, "rojo"));
		list.add(new Vehicle("7314QWE", 4, "verde"));
		list.add(new Vehicle("5930POI", 2, "negro"));
		list.add(new Vehicle("1705UBG", 4, "blanco"));
		list.add(new Vehicle("3495JZA", 2, "naranja"));
		Object vehiclesArray[] = list.stream()
								 .toArray();
		for(Object v: vehiclesArray) {
			System.out.println(v);
		}
		
	}

	public static void main(String[] args) {

		new ToArray().show();

	}

}
