package tema7_Herencia.interfaces;

public class Main2 {

	public void showInterfaces() {

		Vehicle vehicle;
		ActionsVehicle actionsVehicle;

		vehicle = new Vehicle(2, "azul");
		System.out.printf("La velocidad del vehículo es %.2f km/h", vehicle.getSpeed());

		actionsVehicle = vehicle;
		actionsVehicle.accelerate(100.39);
		//Error de compilación: el método getSpeed no está definido para el tipo ActionsVehicle
		System.out.printf("\nLa velocidad del vehículo es %.2f km/h", actionsVehicle.getSpeed());

	}

	public static void main(String[] args) {

		new Main2().showInterfaces();

	}

}
