package tema7_Herencia.visibilidad1;

public class Vehicle {

	protected int wheelCount;
	protected double speed;
	protected String colour;

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

	protected void accelerate(double amount) { //Método protected
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

}