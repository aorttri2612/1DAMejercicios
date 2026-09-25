package tema5_POO.invariante;

public class Vehicle {

	private int wheelCount;
	private double speed;
	private String colour;

	public Vehicle(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		setColour(colour);//El constructor llama al método setColour
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
		if(colour.isEmpty()) {//Control del invariante
			throw new IllegalArgumentException();
		}
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
		return String.format("Número de ruedas: %d, color: %s, velocidad: %.2f", wheelCount, colour, speed);
	}

}