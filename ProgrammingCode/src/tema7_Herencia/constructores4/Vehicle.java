package tema7_Herencia.constructores4;

public class Vehicle {

	protected int wheelCount;
	protected double speed;
	protected String colour;

	/* 
	 * Tiene un constructor con parámetros, por lo tanto, Java no crea 
	 * el constructor por defecto myClass()
	 */
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

}