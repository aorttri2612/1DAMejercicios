package tema7_Herencia.toString;

public class Main1 {

	public void showToString() {

		Vehicle vehicle;
		Car car;
		vehicle = new Vehicle(2, "azul");
		vehicle.accelerate(200);
		System.out.println(vehicle.toString());
		car = new Car(4,"rojo");
		car.refuel(100);
		car.accelerate(45);
		System.out.println(car.toString());

	}

	public static void main(String[] args) {

		new Main1().showToString();

	}

}
