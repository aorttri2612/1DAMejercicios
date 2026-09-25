package tema7_Herencia.usosFinal;

public class Vehicle {

	protected int wheelCount;
	protected double speed;
	protected String colour;

	public Vehicle(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public double getSpeed() {
		return speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	final public void accelerate(double amount) {//Este método no puede ser anulado por las subclases
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

}