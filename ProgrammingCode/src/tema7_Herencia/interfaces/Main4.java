package tema7_Herencia.interfaces;

public class Main4 {

	public void showInterfaces() {

		Vehicle[] vehicles = new Vehicle[3];
        Vehicle[] vehicles2 = new Vehicle[3];
		ActionsVehicle[] actionsVehicles;

		vehicles[0] = new Vehicle(2, "azul");
		vehicles[1] = new Vehicle(4, "rojo");
		vehicles[2] = new Vehicle(4, "blanco");
		for(int i=0;i<vehicles.length;i++) {
			System.out.printf("La velocidad del vehículo es %.2f km/h\n", vehicles[i].getSpeed());
		}		
		//Asignación entre arrays clase-interfaz:
		actionsVehicles = vehicles;
		for(int i=0;i<vehicles.length;i++) {
			actionsVehicles[i].accelerate(i*40);
		}		
		for(int i=0;i<vehicles.length;i++) {
			System.out.printf("La velocidad del vehículo es %.2f km/h\n", vehicles[i].getSpeed());
		}
        //Asignación entre arrays interfaz-clase utilizando casting:
		vehicles2 = (Vehicle[]) actionsVehicles;
		for(int i=0;i<vehicles.length;i++) {
			System.out.printf("La velocidad del vehículo es %.2f km/h\n", vehicles2[i].getSpeed());
		}

	}

	public static void main(String[] args) {

		new Main4().showInterfaces();

	}

}
