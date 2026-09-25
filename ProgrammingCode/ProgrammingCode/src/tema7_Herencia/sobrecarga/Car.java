package tema7_Herencia.sobrecarga;

public class Car extends Vehicle {

	private double gasoline;

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	public void accelerate() { //Sobrecarga del método heredado accelerate
		speed += 10;
	}

}
