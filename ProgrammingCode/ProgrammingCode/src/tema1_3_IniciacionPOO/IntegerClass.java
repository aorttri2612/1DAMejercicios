package tema1_3_IniciacionPOO;

public class IntegerClass {
	
	public void show() {
		
		Integer integer1, integer2;
		int i;
		integer1 = 5;
		System.out.println(integer1);
		i = Integer.parseInt("7");//Convierte la cadena a int. Método estático por lo que se utiliza con Integer
		System.out.println(i);
		integer2 = Integer.valueOf(i);//Convierte el int a Integer. También es estático
		System.out.println(integer2);
		i = integer1.intValue();//Convierte el Integer a int. Método dinámico por lo que se utiliza con el objeto 
		System.out.println(i);		
		
	}

	public static void main(String[] args) {

		new IntegerClass().show();
		
	}

}
