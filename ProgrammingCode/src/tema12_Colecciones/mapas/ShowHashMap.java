package tema12_Colecciones.mapas;

import java.util.HashMap;
import java.util.Map;

public class ShowHashMap {

	public void show() {

		Map<String, Vehicle> map = new HashMap<>();
		Map<String, Vehicle> map2 = new HashMap<>();
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

		System.out.println(map.containsKey("1005SAW"));//false
		System.out.println(map.containsKey("1705UBG"));//true
		System.out.println(map.containsValue(new Vehicle("5930POI", 4, "negro")));//false
		System.out.println(map.containsValue(new Vehicle("5930POI", 2, "negro")));//true
		System.out.println(map.get("4554ASD"));//null
		System.out.println(map.get("1705UBG"));//Matrícula: 1705UBG Número de ruedas: 4, color: blanco, velocidad: 0,00
		System.out.println(map.getOrDefault("8080SAS", new Vehicle("4554ASD", 4, "negro")));//Matrícula: 4554ASD Número de ruedas: 4, color: negro, velocidad: 0,00
		System.out.println(map.getOrDefault("1705UBG", new Vehicle("4554ASD", 4, "negro")));//Matrícula: 1705UBG Número de ruedas: 4, color: blanco, velocidad: 0,00
		System.out.println(map.put("6320LPL", new Vehicle("6320LPL", 2, "verde")));//null
		System.out.println(map.put("6320LPL", new Vehicle("6320LPL", 4, "beis")));//Matrícula: 6320LPL Número de ruedas: 2, color: verde, velocidad: 0,00
		System.out.println(map.putIfAbsent("4687RTB", new Vehicle("4687RTB", 2, "blanco")));//null
		System.out.println(map.putIfAbsent("4687RTB", new Vehicle("4687RTB", 4, "naranja")));//Matrícula: 4687RTB Número de ruedas: 2, color: blanco, velocidad: 0,00
		System.out.println(map.remove("1234ABC"));//null
		System.out.println(map.remove("4687RTB"));//Matrícula: 4687RTB Número de ruedas: 2, color: blanco, velocidad: 0,00

		System.out.printf("El mapa tiene %d vehículos", map.size());
		map2.put("7410HJH", new Vehicle("7410HJH", 4, "rojo"));
		map2.put("8520FGF", new Vehicle("8520FGF", 2, "verde"));
		map.putAll(map2);//añade a map los pares clave-valor del mapa map2
		System.out.printf("\nDespués de añadirle map2, el mapa tiene %d vehículos", map.size());

	}

	public static void main(String[] args) {

		new ShowHashMap().show();

	}

}