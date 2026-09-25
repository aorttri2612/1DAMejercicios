package tema5_POO.thisObjetoActual2;

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

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

	public double addSpeeds(Vehicle vehicle) {//Devuelve la suma de dos velocidades
		return speed + vehicle.speed;
	}

	public void doubleSpeed() {
		speed = addSpeeds(this); //Se le pasa al método addSpeeds la referencia al objeto actual
	}

}