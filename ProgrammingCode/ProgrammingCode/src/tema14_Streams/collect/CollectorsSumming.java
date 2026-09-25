package tema14_Streams.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSumming {

	public void show() {

		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle("9685KMX", 4, "azul"));
		list.add(new Vehicle("1235GTR", 2, "rojo"));
		list.add(new Vehicle("7314QWE", 4, "verde"));
		list.add(new Vehicle("5930POI", 2, "negro"));
		list.add(new Vehicle("1705UBG", 4, "blanco"));
		list.add(new Vehicle("3495JZA", 2, "naranja"));
		int sumWheels = list.stream()
					    .collect(Collectors.summingInt(Vehicle::getWheelCount));
		System.out.println(sumWheels);//18

	}

	public static void main(String[] args) {

		new CollectorsSumming().show();

	}

}
