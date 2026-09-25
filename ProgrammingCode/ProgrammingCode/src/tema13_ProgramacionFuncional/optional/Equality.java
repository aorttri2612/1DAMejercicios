package tema13_ProgramacionFuncional.optional;

import java.util.Optional;

public class Equality {

	public void show() {

		Optional<Integer> optional1 = Optional.of(1000); //Crea un optional con valor 1000
		Optional<Integer> optional2 = Optional.of(1000);
		Optional<Integer> optional3 = Optional.empty();
		Optional<String> optional4 = Optional.empty();

		System.out.println(optional1.equals(optional2)); //Comprueba si tienen el mismo valor: true
		System.out.println(optional1 == optional2); //Comprueba si son el mismo objeto: false
		System.out.println(optional3.equals(optional4));//Dos Optional vacíos de distinto tipo son considerados iguales: true
		System.out.println(optional3.equals(null));//False

	}

	public static void main(String[] args) {

		new Equality().show();

	}

}
