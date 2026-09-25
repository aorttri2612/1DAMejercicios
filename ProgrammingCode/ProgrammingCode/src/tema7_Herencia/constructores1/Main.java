package tema7_Herencia.constructores1;

public class Main {

	public void showConstructors1() {

		Vehicle vehicle;
		Car car;

		vehicle = new Vehicle(2, "azul");
		System.out.printf("Vehículo: %d ruedas y de color %s", vehicle.getWheelCount(), vehicle.getColour());

		car = new Car(4, "rojo");
		System.out.printf("\nCoche: %d ruedas y de color %s", car.getWheelCount(), car.getColour());

	}

	public static void main(String[] args) {

		new Main().showConstructors1();

	}

}
