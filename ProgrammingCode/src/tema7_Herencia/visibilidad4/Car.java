package tema7_Herencia.visibilidad4;

import tema7_Herencia.visibilidad1.Vehicle;

public class Car extends Vehicle {

	private double gasoline;

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	@Override
	protected void accelerate(double amount) { //Anula el método heredado y lo deja exactamente igual
		speed += amount;
	}

}
