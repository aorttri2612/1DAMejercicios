package tema7_Herencia.instanceofObjetos;

public class Main2 {

	public void showInstanceof() {

		Vehicle vehicle = new Car(4, "rojo");
		Car car;
		
		if(vehicle instanceof Car) {//Antes de Java 14
			car = (Car) vehicle;
			car.refuel(50);
			System.out.println(car);
		}
		
		if(vehicle instanceof Car car2) {//A partir de Java 14
			car2.refuel(100);
			System.out.println(car2);
		}

	}

	public static void main(String[] args) {

		new Main2().showInstanceof();

	}

}
