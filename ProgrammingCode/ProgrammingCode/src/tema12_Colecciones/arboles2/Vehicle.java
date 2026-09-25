package tema12_Colecciones.arboles2;

public class Vehicle implements Comparable<Vehicle> {

	private String registration;
	private int wheelCount;
	private double speed;
	private String colour;

	public Vehicle(String registration, int wheelCount, String colour) {
		this.registration = registration;
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

	public String getRegistration() {
		return registration;
	}

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

	@Override
	public String toString() {
		return String.format("Matrícula: %s Número de ruedas: %d, color: %s, velocidad: %.2f", registration, wheelCount, colour, speed);
	}

	@Override
	public int compareTo(Vehicle o) {
		int result = colour.compareTo(o.colour);
		if (result == 0) {//Introducimos un segundo criterio de ordenación
			result = registration.compareTo(o.registration);
		}
		return result;
	}

}