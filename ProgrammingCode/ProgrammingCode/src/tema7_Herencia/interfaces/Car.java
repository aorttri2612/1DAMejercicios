package tema7_Herencia.interfaces;

public class Car implements GasolineMotor {//La clase Car implementa la interfaz GasolineMotor

	private int wheelCount;
	private double speed;
	private String colour;
	private double gasoline;

	public Car(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
		gasoline = 0;
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
	public void accelerate(double amount) {//Método a implementar debido a la interfaz padre ActionsVehicle
		speed += amount;
		gasoline -= amount * 0.01;
	}

	@Override
	public void brake(double amount) {//Método a implementar debido a la interfaz padre ActionsVehicle
		speed -= amount;
	}

	@Override
	public double getGasoline() {//Método a implementar debido a la interfaz hija GasolineMotor
		return gasoline;
	}

	@Override
	public void refuel(double liters) {//Método a implementar debido a la interfaz hija GasolineMotor
		gasoline += liters;
	}

}
