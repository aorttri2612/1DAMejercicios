package tema7_Herencia.toString;

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

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

	@Override
	public String toString() {//Se anula el toString de Object
		return String.format("Número de ruedas: %d, color: %s, velocidad: %.2f", wheelCount, colour, speed);
	}

}