package tema7_Herencia.modificadorProtected;

public class Vehicle { //Superclase o clase padre

	protected int wheelCount; //Atributos protected
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

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

}