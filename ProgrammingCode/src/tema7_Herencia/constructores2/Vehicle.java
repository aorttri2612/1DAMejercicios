package tema7_Herencia.constructores2;

public class Vehicle {

	protected int wheelCount;
	protected double speed;
	protected String colour;

	//No tiene constructor, por lo que Java lo crea por defecto: myClass()

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