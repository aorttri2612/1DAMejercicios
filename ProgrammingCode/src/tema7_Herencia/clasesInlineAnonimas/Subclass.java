package tema7_Herencia.clasesInlineAnonimas;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

public class Subclass extends MyClass {

	@Override
	public void showMessage() {
		System.out.println(RED + message + RESET);
	}

}
