package tema7_Herencia.instanceofObjetos;

public class Main {

	public void showInstanceof() {

		Vehicle vehicle;
		Car car;

		vehicle = new Vehicle(2, "azul");
		car = new Car(4, "rojo");
		System.out.println(vehicle instanceof Vehicle);//true
		System.out.println(vehicle instanceof Car);//false
		System.out.println(car instanceof Car);//true
		System.out.println(car instanceof Vehicle);//true
		vehicle = car;
		System.out.println(vehicle instanceof Car);//true

	}

	public static void main(String[] args) {

		new Main().showInstanceof();

	}

}
