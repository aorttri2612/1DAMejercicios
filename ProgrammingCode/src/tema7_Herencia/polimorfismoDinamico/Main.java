package tema7_Herencia.polimorfismoDinamico;

public class Main {

	public void showDynamicPolymorphism() {

		Vehicle vehicle;//Variable de tipo padre

		vehicle = new Vehicle(2, "azul");//Objeto del padre
		vehicle.accelerate(100.39);//Método del padre
		System.out.printf("La velocidad del vehículo es %.2f km/h", vehicle.getSpeed());

		vehicle = new Car(4, "rojo");//Objeto del hijo
		vehicle.accelerate(50.89);//Método del hijo
		System.out.printf("\nLa velocidad del coche es %.2f km/h", vehicle.getSpeed());

	}

	public static void main(String[] args) {

		new Main().showDynamicPolymorphism();

	}

}
