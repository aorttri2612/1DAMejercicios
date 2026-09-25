package tema7_Herencia.clasesInlineAnonimas;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

public class Main2 {

	public void showAnonymousInnerClass() {

		new Message() {
			@Override
			public void showMessage() {
				System.out.println(RED + "Clases inline anónimas" + RESET);
			}
		}.showMessage();

		new Message() {
			@Override
			public void showMessage() {
				System.out.println(BLUE + "Clases inline anónimas" + RESET);
			}
		}.showMessage();

	}

	public static void main(String[] args) {

		new Main2().showAnonymousInnerClass();

	}

}
