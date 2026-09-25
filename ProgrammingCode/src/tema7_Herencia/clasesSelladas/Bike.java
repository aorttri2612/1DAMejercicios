package tema7_Herencia.clasesSelladas;

public final class Bike extends Vehicle {

	public Bike(int wheelCount, String colour) {
		super(wheelCount, colour);
	}
	
	@Override
	public String toString() {
		return String.format("Bicicleta -> %s", super.toString());
	}

}