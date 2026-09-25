package tema12_Colecciones.pilasYColas;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShowDeque {

	public void show() {

		Deque<Vehicle> deque = new ArrayDeque<>();
		deque.add(new Vehicle("9685KMX", 4, "azul"));
		deque.add(new Vehicle("1235GTR", 2, "rojo"));
		deque.add(new Vehicle("7314QWE", 4, "verde"));
		System.out.println(deque.getLast());//Devuelve pero no elimina: 7314QWE
		System.out.println(deque.peekLast());//Devuelve pero no elimina: 7314QWE
		System.out.println(deque.pollLast());//Devuelve y elimina: 7314QWE
		System.out.println(deque.removeLast());//Devuelve y elimina: 1235GTR
		System.out.println(deque.removeLast());//Devuelve y elimina el último, se queda la pila vacía: 9685KMX
		System.out.println(deque.peekLast());//Devuelve null
		System.out.println(deque.pollLast());//Devuelve null
		System.out.println(deque.getLast());//Lanza NoSuchElementException porque la pila está vacía
		System.out.println(deque.removeLast());//Lanza NoSuchElementException porque la pila está vacía

	}

	public static void main(String[] args) {

		new ShowDeque().show();

	}

}
