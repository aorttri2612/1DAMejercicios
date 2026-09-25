package tema5_POO.noEncapsulacion;

public class Vehicle { //Clase que no utiliza encapsulación

	public int wheelCount;
	public double speed;
	public String colour;

	public Vehicle(int wheelCount, String colour) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		speed = 0;
	}

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

}