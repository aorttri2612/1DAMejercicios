package tema5_POO.visibilidad;

public class Vehicle {

	private int wheelCount;
	private double speed;
	private String colour;

	public Vehicle(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
	}

	int getWheelCount() {//Modificador de acceso friendly
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
	public String toString() {
		return String.format("Número de ruedas: %d, color: %s, velocidad: %.2f km/h", wheelCount, colour, speed);
	}

}