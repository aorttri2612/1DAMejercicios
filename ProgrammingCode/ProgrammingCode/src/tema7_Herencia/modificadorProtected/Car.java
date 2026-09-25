package tema7_Herencia.modificadorProtected;

public class Car extends Vehicle { //Car es hijo de Vehicle

	private double gasoline;//Atributo propio de Car

	//Car hereda de Vehicle los atributos wheelCount,speed y colour ya que son protected
	//También hereda todos los métodos de Vehicle ya que son public

	public double getGasoline() { //Método propio de Car
		return gasoline;
	}

	public void refuel(double liters) {//Método propio de Car
		gasoline += liters;
	}

}
