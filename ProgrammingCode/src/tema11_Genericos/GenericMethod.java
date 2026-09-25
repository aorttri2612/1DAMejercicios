package tema11_Genericos;

public class GenericMethod {

	public <T> String showType(T parameter) {//El genérico <T> se declara delante del tipo de devolución String
		
		return parameter.getClass().getSimpleName();
		
	}
	
	public void show() {
		
		System.out.printf("El tipo del parámetro es %s\n", showType(80));
		System.out.printf("El tipo del parámetro es %s\n", showType(78.6));
		System.out.printf("El tipo del parámetro es %s\n", showType("Métodos genéricos"));
		System.out.printf("El tipo del parámetro es %s\n", showType(new Vehicle(4, "azul")));

	}
	
	public static void main(String[] args) {

		new GenericMethod().show();

	}

}
