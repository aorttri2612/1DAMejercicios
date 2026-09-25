package tema14_Streams.modelVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsVariousLevelsOfGroupingBy {

	public void show() {

		List<ModelVehicle> vehicles = new ArrayList<>();
		vehicles.add(new ModelVehicle("Audi", 4, List.of("azul","rojo")));
		vehicles.add(new ModelVehicle("Ford", 4, List.of("naranja","blanco","verde")));
		vehicles.add(new ModelVehicle("Seat", 4, List.of("amarillo","verde")));
		vehicles.add(new ModelVehicle("Audi", 2, List.of("negro")));
		vehicles.add(new ModelVehicle("Ford", 2, List.of("rojo","blanco")));
		vehicles.add(new ModelVehicle("Seat", 2, List.of("amarillo","morado")));
		vehicles.stream()
				.collect(Collectors.groupingBy(ModelVehicle::getModel,
					   						 Collectors.groupingBy(ModelVehicle::getWheelCount, 
					   								 			   Collectors.flatMapping(v -> v.getColours().stream(),
					   								 					   			  	  Collectors.counting()))))
				.forEach((k, v) -> {
					v.forEach((k2, v2) -> {
					System.out.printf("Modelo %s con %d ruedas está disponible en %d %s\n",k,k2,v2,v2==1?"color":"colores");
				});
		});
	}

	public static void main(String[] args) {

		new CollectorsVariousLevelsOfGroupingBy().show();

	}

}
