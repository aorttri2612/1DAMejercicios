package tema7_Herencia.interfaces;

public class Vehicle implements ActionsVehicle {//La clase Vehicle implementa la interfaz ActionsVehicle

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

	@Override
	public void accelerate(double amount) {//Método a implementar debido a la interfaz ActionsVehicle
		speed += amount;
	}

	@Override
	public void brake(double amount) {//Método a implementar debido a la interfaz ActionsVehicle
		speed -= amount;
	}

}