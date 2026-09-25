package tema7_Herencia.constructores3;

public class Car extends Vehicle {

	private double gasoline;

	/* 
	 * No tiene constructor. Java lo crea por defecto con la línea de código 
	 * super(), es decir, con una llamada al constructor por defecto de la
	 * superclase. Por lo tanto, está llamando a myClass(), dando un error 
	 * de compilación ya que no se ha creado. 
	 */

	public double getGasoline() {
		return gasoline;
	}

	public void refuel(double liters) {
		gasoline += liters;
	}

	@Override
	public void accelerate(double amount) {
		super.accelerate(amount);
		gasoline -= amount * 0.01;
	}

}
