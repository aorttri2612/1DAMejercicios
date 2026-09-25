package tema12_Colecciones.sinDuplicados;

import java.util.HashSet;
import java.util.Set;

public class ShowHashSet {

	public void show() {

		Set<Vehicle> set = new HashSet<>();
		set.add(new Vehicle(4, "azul"));
		set.add(new Vehicle(2, "rojo"));
		set.add(new Vehicle(4, "azul"));
		set.add(new Vehicle(2, "rojo"));
		set.add(new Vehicle(4, "verde"));
		for (Vehicle v : set) {
			System.out.println(v);//Se llama al toString del objeto
		}

	}

	public static void main(String[] args) {

		new ShowHashSet().show();

	}

}
