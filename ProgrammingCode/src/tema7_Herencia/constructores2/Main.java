package tema7_Herencia.constructores2;

public class Main {

	public void showConstructors2() {

		Vehicle vehicle;
		Car car;

		vehicle = new Vehicle();//Constructor creado por Java
		car = new Car();//Constructor creado por Java que contiene super()
		vehicle.accelerate(3);
		car.accelerate(100);
		System.out.printf("El vehículo va a %.2f km/h", vehicle.getSpeed());
		System.out.printf("\nEl coche va a %.2f km/h", car.getSpeed());

	}

	public static void main(String[] args) {

		new Main().showConstructors2();

	}

}
