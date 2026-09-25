package tema12_Colecciones.mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TraverseHashMap {

	public void show() {

		Map<String, Vehicle> map = new HashMap<>();
		Vehicle vehicles[] = new Vehicle[6];
		vehicles[0] = new Vehicle("9685KMX", 4, "azul");
		vehicles[1] = new Vehicle("1235GTR", 2, "rojo");
		vehicles[2] = new Vehicle("7314QWE", 4, "verde");
		vehicles[3] = new Vehicle("5930POI", 2, "negro");
		vehicles[4] = new Vehicle("1705UBG", 4, "blanco");
		vehicles[5] = new Vehicle("3495JZA", 2, "naranja");
		for (int i = 0; i < vehicles.length; i++) {
			map.put(vehicles[i].getRegistration(), vehicles[i]);
		}

		System.out.println("Claves del mapa:\n");
		for (String s : map.keySet()) {//keySet() devuelve un conjunto con todas las claves
			System.out.println(s);
		}

		System.out.println("\nValores del mapa:\n");
		for (Vehicle v : map.values()) {//values() devuelve una colección con todos los vehículos
			System.out.println(v);
		}

		System.out.println("\nPares clave-valor del mapa usando un foreach:\n");
		for (Map.Entry<String, Vehicle> entry : map.entrySet()) {
			System.out.printf("Matrícula -> %s Vehículo -> %s\n", entry.getKey(), entry.getValue());
		}

		System.out.println("\nPares clave-valor del mapa usando iteradores:\n");
		Set<Map.Entry<String, Vehicle>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Vehicle>> it = entrySet.iterator();
		Map.Entry<String, Vehicle> entry;
		while (it.hasNext()) {
			entry = it.next();
			System.out.printf("Matrícula -> %s Vehículo -> %s\n", entry.getKey(), entry.getValue());
		}

	}

	public static void main(String[] args) {

		new TraverseHashMap().show();

	}

}
