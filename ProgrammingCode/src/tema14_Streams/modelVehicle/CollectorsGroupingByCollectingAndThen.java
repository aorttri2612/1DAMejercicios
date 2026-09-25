package tema14_Streams.modelVehicle;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsGroupingByCollectingAndThen {

	public void show() {

		ModelVehicle vehicles[] = new ModelVehicle[4];
		vehicles[0] = new ModelVehicle("Audi", 4, List.of("azul","rojo","blanco"));
		vehicles[1] = new ModelVehicle("Ford", 4, List.of("naranja","blanco"));
		vehicles[2] = new ModelVehicle("Audi", 2, List.of("negro","verde"));
		vehicles[3] = new ModelVehicle("Ford", 2, List.of("negro","blanco"));
		Arrays.stream(vehicles)
			  .collect(Collectors.groupingBy(ModelVehicle::getWheelCount, TreeMap::new,
						  					 Collectors.collectingAndThen(Collectors.flatMapping(v -> v.getColours().stream(),Collectors.toList()),
						  								 				  list -> list.stream().distinct().collect(Collectors.joining("-")))))		
			  .forEach((k, v) -> System.out.printf("Número de ruedas:%d Colores: %s\n", k, v));		
	}

	public static void main(String[] args) {

		new CollectorsGroupingByCollectingAndThen().show();

	}

}
