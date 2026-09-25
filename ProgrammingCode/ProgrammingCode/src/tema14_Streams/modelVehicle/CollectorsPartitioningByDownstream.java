package tema14_Streams.modelVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsPartitioningByDownstream {

	public void show() {

		List<ModelVehicle> vehicles = new ArrayList<>();
		vehicles.add(new ModelVehicle("Audi", 4, List.of("azul","rojo")));
		vehicles.add(new ModelVehicle("Ford", 4, List.of("naranja","blanco","verde")));
		vehicles.add(new ModelVehicle("Seat", 4, List.of("amarillo","verde")));
		vehicles.add(new ModelVehicle("Audi", 2, List.of("negro")));
		vehicles.add(new ModelVehicle("Ford", 2, List.of("rojo","blanco")));
		vehicles.stream()
				.collect(Collectors.partitioningBy(v -> v.getWheelCount() == 4,
					  							 Collectors.counting()))
				.forEach((k, v) -> System.out.printf("%s hay en %d modelos\n", k?"Vehículos de 4 ruedas:":"Vehículos que no son de 4 ruedas:",v));		
	}

	public static void main(String[] args) {

		new CollectorsPartitioningByDownstream().show();

	}

}
