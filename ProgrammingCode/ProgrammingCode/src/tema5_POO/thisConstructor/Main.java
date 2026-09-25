package tema5_POO.thisConstructor;

public class Main {

	public void showThisConstructor() {

		Vehicle car, moto;
		car = new Vehicle();
		moto = new Vehicle(2, "rojo");
		System.out.printf("Coche: %d ruedas y de color %s", car.getWheelCount(), car.getColour());
		System.out.printf("\nMoto: %d ruedas y de color %s", moto.getWheelCount(), moto.getColour());

	}

	public static void main(String[] args) {

		new Main().showThisConstructor();

	}

}
