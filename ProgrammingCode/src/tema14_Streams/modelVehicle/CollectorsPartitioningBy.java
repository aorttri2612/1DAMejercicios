package tema14_Streams.modelVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {

	public void show() {

		List<ModelVehicle> vehicles = new ArrayList<>();
		vehicles.add(new ModelVehicle("Audi", 4, List.of("azul","rojo")));
		vehicles.add(new ModelVehicle("Ford", 4, List.of("naranja","blanco")));
		vehicles.add(new ModelVehicle("Audi", 2, List.of("negro","verde")));
		vehicles.add(new ModelVehicle("Ford", 2, List.of("amarillo","blanco")));
		vehicles.stream()
				.collect(Collectors.partitioningBy(v -> v.getWheelCount() == 4))
				.forEach((k, v) -> {
					System.out.printf("%s\n", k?"Vehículos de 4 ruedas:":"Vehículos que no son de 4 ruedas:");
					v.forEach(System.out::println);
		});		
	}

	public static void main(String[] args) {

		new CollectorsPartitioningBy().show();

	}

}
