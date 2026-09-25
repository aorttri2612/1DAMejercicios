package tema14_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinComparator {

	public void show() {

		Optional<Vehicle> minVehicle;
		Optional<Vehicle> maxVehicle;
		String registration;
		List<Vehicle> list = new ArrayList<>();
		List<Vehicle> listEmpty = new ArrayList<>();
		list.add(new Vehicle("1705UBG", 4, "blanco"));
		list.add(new Vehicle("1235GTR", 2, "rojo"));
			
		System.out.println("Vehículo con menor número de ruedas:");
		minVehicle = list.stream()
					 .min(Comparator.comparingInt(Vehicle::getWheelCount));
		minVehicle.ifPresent(System.out::println);			
		
		System.out.println("Vehículo con mayor matrícula alfabéticamente:");
		maxVehicle = list.stream()
					 .max(Comparator.comparing(Vehicle::getRegistration));
		maxVehicle.ifPresent(System.out::println);
		
		registration = list.stream()
					   .min(Comparator.comparingInt(Vehicle::getWheelCount))
					   .map(Vehicle::getRegistration)
					   .orElse("No encontrado");
		System.out.printf("Matrícula del vehículo con menor número de ruedas: %s\n",registration);
		
		registration = listEmpty.stream()
				   .min(Comparator.comparingInt(Vehicle::getWheelCount))
				   .map(Vehicle::getRegistration)
				   .orElse("No encontrado");
		System.out.printf("Matrícula del vehículo con menor número de ruedas: %s",registration);

	}

	public static void main(String[] args) {

		new MaxMinComparator().show();

	}

}
