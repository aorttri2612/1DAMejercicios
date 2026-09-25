package tema5_POO.sintaxisFluida;

public class Vehicle2 { //Clase que utiliza sintaxis fluida en los métodos accelerate y brake

	private int wheelCount;
	private double speed;
	private String colour;

	public Vehicle2(int wheelCount, String colour) {
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

	public Vehicle2 accelerate(double amount) {
		speed += amount;
		return this; //Se devuelve una referencia al objeto actual para poder utilizar sintaxis fluida
	}

	public Vehicle2 brake(double amount) {
		speed -= amount;
		return this; //Se devuelve una referencia al objeto actual para poder utilizar sintaxis fluida
	}

}