package tema7_Herencia.toString;

public class Main2 {

	public void showToString() {

		Vehicle vehicle;
		Car car;
		vehicle = new Vehicle(2, "azul");
		vehicle.accelerate(200);
		System.out.println(vehicle);//Se llama al toString del objeto
		car = new Car(4,"rojo");
		car.refuel(100);
		car.accelerate(45);
		System.out.println(car);//Se llama al toString del objeto

	}

	public static void main(String[] args) {

		new Main2().showToString();

	}

}
