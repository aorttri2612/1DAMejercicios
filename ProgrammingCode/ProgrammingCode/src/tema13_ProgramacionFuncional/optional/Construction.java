package tema13_ProgramacionFuncional.optional;

import java.util.Optional;

public class Construction {

	public void show() {

		Optional<Integer> optional1 = Optional.empty(); // Crea un optional sin valor.
		System.out.println(optional1);
		Optional<Integer> optional2 = Optional.of(1000); // Crea un optional con valor 1000		
		System.out.println(optional2);

		// Retorna un Optional vacío si el valor pasado como argumento es null:
		Optional<Integer> optional3 = Optional.ofNullable(methodWhichCanReturnNull(5));
		System.out.println(optional3);
		Optional<Integer> optional4 = Optional.ofNullable(methodWhichCanReturnNull(2));
		System.out.println(optional4);

		Optional<Integer> optional5;
		try {
			optional5 = Optional.of(null);
			System.out.println(optional5);
		} catch (NullPointerException e) {
			System.err.println("Se ha lanzado la excepción NullPointerException");
		}

	}

	public Integer methodWhichCanReturnNull(int num) {

		if (num >= 5) {
			return num;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {

		new Construction().show();

	}

}
