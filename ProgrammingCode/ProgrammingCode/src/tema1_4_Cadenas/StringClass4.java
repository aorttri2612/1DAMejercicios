package tema1_4_Cadenas;

public class StringClass4 {
	
	public void show() {
		
		String string1 = "hola", string2 = "adios", string3 = "Hola";
		String string5 = "Estoy aprendiendo Programación";
		String string6 = "Hace tiempo estuve aprendiendo Junit";
		String string7 = """
				  		 Línea 1
				  		 Línea 2
				  		 Línea 3
				  		 """;
		String string8 = """
						     Línea 1
						     Línea 2
						     Línea 3
						 """;
		String string4,string9,string10,comparison;

		//"hola" es mayor que "adios"
		comparison = String.format("%s es %s que %s", string1, string1.compareTo(string2) > 0 ? "mayor" : "menor", string2);
		System.out.println(comparison);
		
		//"adios" es menor que "hola"
		comparison = String.format("%s es %s que %s", string2, string2.compareTo(string1) > 0 ? "mayor" : "menor", string1);
		System.out.println(comparison);
		
		//En el Unicode, las mayúsculas están antes: "Hola" es menor que "adios"
		comparison = String.format("%s es %s que %s", string3, string3.compareTo(string2) > 0 ? "mayor" : "menor", string2);
		System.out.println(comparison);
		
		//"Hola" es mayor que "adios" si no tenemos en cuenta las mayúsculas y minúsculas
		comparison = String.format("%s es %s que %s si no tenemos en cuenta las mayúsculas y minúsculas", string3, string3.compareToIgnoreCase(string2) > 0 ? "mayor" : "menor", string2);
		System.out.println(comparison);

		System.out.println(string4 = string1.concat(" que tal"));//string4="hola que tal"
		System.out.println(string4.endsWith("tal"));//true
		System.out.println(string4.endsWith("hola"));//false
		System.out.println(string4.startsWith("hola"));//true
		System.out.println(string4.startsWith("tal"));//false

		System.out.println(string4.indexOf("hola"));//0
		System.out.println(string4.indexOf("tal"));//9
		System.out.println(string4.indexOf("que"));//5
		System.out.println(string4.indexOf(string2));//-1
		System.out.println(string4.indexOf(string3));//-1
		System.out.println(string4.indexOf('a'));//3
		System.out.println("hola que tal hola que tal".lastIndexOf("tal"));//22

		System.out.println(string4.isEmpty());//false
		System.out.println("".isEmpty());//true

		System.out.println("ole ".repeat(6));//ole ole ole ole ole ole 

		System.out.println(string4.replace('a', '*'));//hol* que t*l
		System.out.println("hola que tal hola que tal".replace("hola", "buenas"));//buenas que tal buenas que tal

		//Para hacer desaparecer partes de una cadena, se reemplazan por cadena vacía
		System.out.println("hola que tal hola que tal".replace(" ", ""));//holaquetalholaquetal

		System.out.println(string4.substring(9));//tal
		System.out.println(string4.substring(5, 8));//que

		System.out.println("HOLA QUE TAL".toLowerCase());//hola que tal
		System.out.println("hola que tal".toUpperCase());//HOLA QUE TAL
		System.out.println("       Hola que tal      ".trim());//Hola que tal
		
		System.out.printf("Las regiones %s son iguales\n", string5.regionMatches(true, 6, string6, 19, 11)?"sí":"no");
		//Las regiones sí son iguales
		
		//Se añaden 4 espacios al principio de cada línea
        string9 = string7.indent(4);
        System.out.printf("Con sangría añadida:\n%s",string9);
      
        //Se quitan 2 espacios al principio de cada línea
        string10 = string8.indent(-2);
        System.out.printf("Con sangría eliminada:\n%s",string10);
		
	}

	public static void main(String[] args) {

		new StringClass4().show();
		
	}

}
