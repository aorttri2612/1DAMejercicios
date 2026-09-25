package tema7_Herencia.constructores4;

public class Car extends Vehicle {

	private double gasoline;

	/*
	 * Java sigue añadiendo de manera implícita la llamada super()
	 * en el constructor y como no hay constructor por defecto en
	 * la clase myClass, da un error de compilación
	 */
	public Car(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
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
