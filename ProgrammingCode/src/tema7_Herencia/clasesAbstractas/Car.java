package tema7_Herencia.clasesAbstractas;

public class Car extends Vehicle {

	private double gasoline;

	public Car(int wheelCount, String colour) {
		super(wheelCount, colour);
		gasoline = 0;
	}

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	@Override
	public void accelerate(double amount) { //Implementación del método abstracto
		speed += amount;
		gasoline -= amount * 0.01;
	}

}
