package tema7_Herencia.interfaces;

public class Main3 {

	public void showInterfaces() {

		Vehicle vehicle;
		ActionsVehicle actionsVehicle;

		vehicle = new Vehicle(2, "azul");
		System.out.printf("La velocidad del vehículo es %.2f km/h", vehicle.getSpeed());

		actionsVehicle = vehicle;
		actionsVehicle.accelerate(100.39);
		System.out.printf("\nLa velocidad del vehículo es %.2f km/h", ((Vehicle) actionsVehicle).getSpeed());//Casting para solucionar el error

	}

	public static void main(String[] args) {

		new Main3().showInterfaces();

	}

}
