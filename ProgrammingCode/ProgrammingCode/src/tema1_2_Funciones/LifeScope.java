package tema1_2_Funciones;

public class LifeScope {
	
	public void show() {
		
		boolean isAnEvenNumber;
		int result;

		isAnEvenNumber = isEven(5);//Nace el parámetro n con el valor 5
		//Aquí n ya no existe porque la función isEven ya ha terminado de ejecutarse 
		System.out.println(isAnEvenNumber);
		isAnEvenNumber = isEven(4);//Vuelve a nacer n pero esta vez con un valor de 4
		//Aquí n ya no existe porque la función isEven ya ha terminado de ejecutarse 
		System.out.println(isAnEvenNumber);

		result = add(5, 2);//Nacen los parámetros sum1 y sum2 con los valores 5 y 2 respectivamente
		//Aquí sum1 y sum2 ya no existen porque la función add ha terminado de ejecutarse
		System.out.println(result);		
		
	}

	public boolean isEven(int n) {//Comienzo del ámbito de vida del parámetro n

		return n % 2 == 0;

	}//Fin del ámbito de vida del parámetro n

	public int add(int sum1, int sum2) {//Comienzo del ámbito de vida de los parámetros sum1 y sum2

		return sum1 + sum2;
		
	}//Fin del ámbito de vida de los parámetros sum1 y sum2
	
	public static void main(String[] args) {

		new LifeScope().show();

	}

}
