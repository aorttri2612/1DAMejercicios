package tema12_Colecciones.arboles3;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ShowTreeMap {

	public void show() {

		SortedMap<String, Vehicle> sortedMap = new TreeMap<>();
		Vehicle vehicles[] = new Vehicle[6];
		vehicles[0] = new Vehicle("9685KMX", 4, "azul");
		vehicles[1] = new Vehicle("1235GTR", 2, "rojo");
		vehicles[2] = new Vehicle("7314QWE", 4, "verde");
		vehicles[3] = new Vehicle("5930POI", 2, "negro");
		vehicles[4] = new Vehicle("1705UBG", 4, "blanco");
		vehicles[5] = new Vehicle("3495JZA", 2, "naranja");
		for (int i = 0; i < vehicles.length; i++) {
			sortedMap.put(vehicles[i].getRegistration(), vehicles[i]);
		}

		for (Map.Entry<String, Vehicle> entry : sortedMap.entrySet()) {
			System.out.printf("Matrícula -> %s Vehículo -> %s\n", entry.getKey(), entry.getValue());
		}

	}

	public static void main(String[] args) {

		new ShowTreeMap().show();

	}

}
