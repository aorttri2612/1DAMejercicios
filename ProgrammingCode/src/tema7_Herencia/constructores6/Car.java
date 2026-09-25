package tema7_Herencia.constructores6;

public class Car extends Vehicle {

	private double gasoline;

	public Car(int wheelCount, String colour) {
		super(wheelCount, colour);
		gasoline = 0;
	}

	/*
	 * Java sigue añadiendo de manera implícita la llamada super()
	 * en el constructor y como no hay constructor por defecto en
	 * la clase myClass, da un error de compilación
	 */
	public Car(int wheelCount) {
		this.wheelCount = wheelCount;
		this.colour = "blanco";
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
