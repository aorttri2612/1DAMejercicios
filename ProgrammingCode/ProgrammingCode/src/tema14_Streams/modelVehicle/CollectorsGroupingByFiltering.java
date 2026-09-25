package tema14_Streams.modelVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsGroupingByFiltering {

	public void show() {

		List<ModelVehicle> vehicles = new ArrayList<>();
		vehicles.add(new ModelVehicle("Audi", 4, List.of("azul","rojo")));
		vehicles.add(new ModelVehicle("Ford", 4, List.of("naranja","blanco")));
		vehicles.add(new ModelVehicle("Audi", 3, List.of("blanco","azul")));
		vehicles.add(new ModelVehicle("Ford", 3, List.of("naranja","verde")));
		vehicles.add(new ModelVehicle("Audi", 2, List.of("negro","verde")));
		vehicles.add(new ModelVehicle("Ford", 2, List.of("amarillo","blanco")));
		vehicles.stream()
				.collect(Collectors.groupingBy(ModelVehicle::getModel,
					   						 Collectors.filtering(v -> v.getWheelCount() > 2, 
					   								 			  Collectors.toList())))
				.forEach((k, v) -> System.out.printf("Modelo:%s Vehículos con más de 2 ruedas: %s\n", k, v));		
	}

	public static void main(String[] args) {

		new CollectorsGroupingByFiltering().show();

	}

}
