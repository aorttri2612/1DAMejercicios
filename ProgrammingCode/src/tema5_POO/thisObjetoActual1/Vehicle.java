package tema5_POO.thisObjetoActual1;

public class Vehicle {

	private int wheelCount;
	private double speed;
	private String colour;

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

	public Vehicle accelerate(double amount) {
		speed += amount;
		return this; //Se devuelve una referencia al objeto actual
	}

	public void brake(double amount) {
		speed -= amount;
	}

}