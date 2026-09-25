package tema7_Herencia.clasesInlineAnonimas;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

public class Main {

	public void showAnonymousInnerClass() {

		MyClass anonymousInner = new MyClass() {
			@Override
			public void showMessage() {
				System.out.println(RED + message + RESET);
			}
		};
		anonymousInner.showMessage();

		new MyClass() {//Lo mismo pero sin crear la variable anonymousInner
			@Override
			public void showMessage() {
				System.out.println(RED + message + RESET);
			}
		}.showMessage();

	}

	public static void main(String[] args) {

		new Main().showAnonymousInnerClass();

	}

}
