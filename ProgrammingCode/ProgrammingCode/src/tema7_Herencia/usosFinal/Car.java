package tema7_Herencia.usosFinal;

public class Car extends Vehicle {

	private double gasoline;

	public Car(int wheelCount, String colour) {
		super(wheelCount, colour);
		gasoline = 0;
	}

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(final double liters) {
		liters++;//Error: no se puede modificar liters
		gasoline += liters;
	}

	@Override
	public void accelerate(double amount) {//No se puede anular el método accelerate de myClass
		super.accelerate(amount);
		gasoline -= amount * 0.01;
	}

}
