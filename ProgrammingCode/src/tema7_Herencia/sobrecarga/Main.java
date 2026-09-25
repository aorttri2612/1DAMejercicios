package tema7_Herencia.sobrecarga;

public class Main {

	public void showOverload() {

		Car car;
		car = new Car();

		car.accelerate(100);//Método heredado
		System.out.printf("La velocidad del coche es %.2f km/h", car.getSpeed());

		car.accelerate();//Método sobrecargado
		System.out.printf("\nLa velocidad del coche es %.2f km/h", car.getSpeed());

	}

	public static void main(String[] args) {

		new Main().showOverload();

	}

}
