package tema1_2_Funciones;

import static tema2_1_EscrituraEnPantalla.colores.Colors.*;

public class Call {
	
	public void show() {
		
		boolean isAnEvenNumber;
		int result;

		isAnEvenNumber = isEven(5);//Se llama a la función isEven con un valor de 5 en el argumento
		showBoolean(isAnEvenNumber);//Se llama al procedimiento showBoolean con la variable isAnEvenNumber como argumento
		isAnEvenNumber = isEven(4);//Se llama a la función isEven con un valor de 4 en el argumento
		showBoolean(isAnEvenNumber);//Se llama al procedimiento showBoolean con la variable isAnEvenNumber como argumento

		result = add(5, 2);//Se llama a la función add con los valores 5 y 2 en los argumentos
		showInt(result);//Se llama al procedimiento showInt con la variable result como argumento		
		
	}

	public boolean isEven(int n) {//Función que devuelve true si n es par

		return n % 2 == 0;

	}

	public int add(int sum1, int sum2) {//Función que suma sum1 y sum2

		return sum1 + sum2;

	}
	
	public void showBoolean(boolean b) {//Procedimiento que muestra por consola el valor de b en rojo
		
		System.out.printf("%s%b%s\n",RED,b,RESET);
		
	}
	
	public void showInt(int n) {//Procedimiento que muestra por consola el valor de n en verde
		
		System.out.printf("%s%d%s\n",GREEN,n,RESET);
		
	}
	
	public static void main(String[] args) {

		new Call().show();
		
	}

}
