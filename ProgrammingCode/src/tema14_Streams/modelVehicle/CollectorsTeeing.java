package tema14_Streams.modelVehicle;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTeeing {

	public void show() {

		Result result;
		List<ModelVehicle> vehicles = new ArrayList<>();
		vehicles.add(new ModelVehicle("Audi", 4, List.of("azul","rojo")));
		vehicles.add(new ModelVehicle("Ford", 4, List.of("naranja","blanco","verde")));
		vehicles.add(new ModelVehicle("Seat", 4, List.of("amarillo","verde")));
		vehicles.add(new ModelVehicle("Audi", 2, List.of("negro")));
		vehicles.add(new ModelVehicle("Ford", 2, List.of("rojo","blanco")));
		vehicles.add(new ModelVehicle("Seat", 2, List.of("amarillo","morado")));
		result = vehicles.stream()
			     .collect(Collectors.teeing(Collectors.minBy(Comparator.comparing((ModelVehicle v) -> v.getColours().size())), 
					  					    Collectors.maxBy(Comparator.comparing((ModelVehicle v) -> v.getColours().size())),
					  					    Result::new));

		result.getMin().ifPresent(v -> System.out.printf("El vehículo que tiene el mínimo número de colores es %s", v));
		result.getMax().ifPresent(v -> System.out.printf("\nEl vehículo que tiene el máximo número de colores es %s", v));
		
	}

	public static void main(String[] args) {

		new CollectorsTeeing().show();

	}

}
