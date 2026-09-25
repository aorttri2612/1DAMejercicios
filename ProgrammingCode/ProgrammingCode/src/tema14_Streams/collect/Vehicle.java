package tema14_Streams.collect;

public class Vehicle {

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
		return "Vehicle [registration=" + registration + ", wheelCount=" + wheelCount + ", speed=" + speed + ", colour="
				+ colour + "]";
	}

}