package tema12_Colecciones.sinDuplicados;

import java.util.LinkedHashSet;
import java.util.Set;

public class ShowLinkedHashSet {

	public void show() {

		Set<Vehicle> set = new LinkedHashSet<>();
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

		new ShowLinkedHashSet().show();

	}

}
