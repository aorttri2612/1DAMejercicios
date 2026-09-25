package tema7_Herencia.instanceofObjetos;

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
	public void accelerate(double amount) {
		super.accelerate(amount);
		gasoline -= amount * 0.01;
	}
	
	@Override
	public String toString() {
		return String.format("%s, gasolina: %.2f", super.toString(), gasoline);
	}

}
