package tema7_Herencia.constructores5;

public class Car extends Vehicle {

	private double gasoline;

	public Car(int wheelCount, String colour) {
		super(wheelCount, colour);//Está llamando al constructor con parámetros de myClass
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

}
