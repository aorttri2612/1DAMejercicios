package tema7_Herencia.visibilidad2;

import tema7_Herencia.visibilidad1.Vehicle;

public class Car extends Vehicle {

	private double gasoline;

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

}
