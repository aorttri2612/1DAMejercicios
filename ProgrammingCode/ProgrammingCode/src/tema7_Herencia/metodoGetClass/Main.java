package tema7_Herencia.metodoGetClass;

public class Main {

	public void show() {

		Vehicle vehicle = new Vehicle(2, "azul");
		System.out.println(vehicle.getClass().getName());//tema7_Herencia.metodoGetClass.Vehicle
		System.out.println(vehicle.getClass().getSimpleName());//Vehicle
		vehicle = new Car(4, "rojo");
		System.out.println(vehicle.getClass().getName());//tema7_Herencia.metodoGetClass.Car
		System.out.println(vehicle.getClass().getSimpleName());//Car

	}

	public static void main(String[] args) {

		new Main().show();

	}

}
