package tema7_Herencia.clasesSelladas;

public final class Motorbike extends Vehicle {

	private double gasoline;

	public Motorbike(int wheelCount, String colour) {
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
		gasoline -= amount * 0.05;
	}

	@Override
	public String toString() {
		return String.format("Moto -> %s, gasolina: %.2f", super.toString(), gasoline);
	}

}