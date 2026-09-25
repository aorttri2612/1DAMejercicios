package tema7_Herencia.interfaces;

public class Main1 {

	public void showInterfaces() {

		Vehicle vehicle;
		ActionsVehicle actionsVehicle;//El tipo de la variable es la interfaz ActionsVehicle

		vehicle = new Vehicle(2, "azul");
		System.out.printf("La velocidad del vehículo es %.2f km/h", vehicle.getSpeed());

		actionsVehicle = vehicle;//Se le asigna un objeto de la clase Vehicle, que implementa la interfaz ActionsVehicle
		actionsVehicle.accelerate(100.39);//Ejecuta un método de la interfaz
		System.out.printf("\nLa velocidad del vehículo es %.2f km/h", vehicle.getSpeed());

	}

	public static void main(String[] args) {

		new Main1().showInterfaces();

	}

}
