package tema12_Colecciones.pilasYColas;

import java.util.ArrayDeque;
import java.util.Queue;

public class ShowQueue {

	public void show() {

		Queue<Vehicle> queue = new ArrayDeque<>();
		queue.add(new Vehicle("9685KMX", 4, "azul"));
		queue.add(new Vehicle("1235GTR", 2, "rojo"));
		queue.add(new Vehicle("7314QWE", 4, "verde"));
		System.out.println(queue.element());//Devuelve pero no elimina: 9685KMX
		System.out.println(queue.peek());//Devuelve pero no elimina: 9685KMX
		System.out.println(queue.poll());//Devuelve y elimina: 9685KMX
		System.out.println(queue.remove());//Devuelve y elimina: 1235GTR
		System.out.println(queue.remove());//Devuelve y elimina el último, se queda la cola vacía: 7314QWE
		System.out.println(queue.peek());//Devuelve null
		System.out.println(queue.poll());//Devuelve null
		System.out.println(queue.element());//Lanza NoSuchElementException porque la cola está vacía
		System.out.println(queue.remove());//Lanza NoSuchElementException porque la cola está vacía

	}

	public static void main(String[] args) {

		new ShowQueue().show();

	}

}
