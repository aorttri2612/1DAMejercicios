package tema7_Herencia.clasesAbstractas;

public abstract class Vehicle { //Clase abstracta

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

	public abstract void accelerate(double amount); //Método abstracto

	public void brake(double amount) {
		speed -= amount;
	}

}