package tema12_Colecciones.mapas;

public class Vehicle {

	private String registration;//Atributo para almacenar la matrícula del coche
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

	public String getRegistration() {//get de la matrícula
		return registration;
	}

	public void accelerate(double amount) {
		speed += amount;
	}

	public void brake(double amount) {
		speed -= amount;
	}

	/* Como se ha añadido el nuevo atributo para la 
	 * matrícula, hay que generar de nuevo los 
	 * métodos toString, equals y hashcode:
	 */

	@Override
	public String toString() {
		return String.format("Matrícula: %s Número de ruedas: %d, color: %s, velocidad: %.2f", registration, wheelCount, colour, speed);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((registration == null) ? 0 : registration.hashCode());
		result = prime * result + wheelCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Vehicle))
			return false;
		Vehicle other = (Vehicle) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (registration == null) {
			if (other.registration != null)
				return false;
		} else if (!registration.equals(other.registration))
			return false;
		if (wheelCount != other.wheelCount)
			return false;
		return true;
	}

}