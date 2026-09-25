package tema13_ProgramacionFuncional;

public class InterfaceFunction {

	public void show() {

		String text = "     Estoy aprendiendo a programar";
		String upperCaseText,replacedText,transformedText;
				
        // Usar transform para convertir el texto a mayúsculas
        upperCaseText = text.transform(String::toUpperCase);
        System.out.println(upperCaseText);  
        
        // Usar transform para reemplazar "programar" por "probar"
        replacedText = text.transform(t -> t.replace("programar", "probar"));
        System.out.println(replacedText);  
        
        // Usar transform para eliminar espacios y convertir a mayúsculas
        transformedText = text
        				  .transform(t -> t.trim()) // Elimina los espacios en blanco
        				  .transform(t -> t.toUpperCase()); // Convierte a mayúsculas
        System.out.println(transformedText);
        
	}

	public static void main(String[] args) {

		new InterfaceFunction().show();

	}

}
