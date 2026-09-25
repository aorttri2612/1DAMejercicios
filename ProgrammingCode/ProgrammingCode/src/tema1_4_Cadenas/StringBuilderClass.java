package tema1_4_Cadenas;

public class StringBuilderClass {
	
	public void show() {
		
		StringBuilder sb = new StringBuilder("Estoy aprendiendo");
		System.out.println(sb);
        sb.append(" Java");
        System.out.printf("Después de append: %s%n", sb);
        sb.insert(17, " a programar en");
        System.out.printf("Después de insert: %s%n", sb);
        sb.delete(17, 32);//Elimina los caracteres comprendidos entre los índices 17 (incluido) y 32 (excluido)
        System.out.printf("Después de delete: %s%n", sb);
        sb.reverse();
        System.out.printf("Después de reverse: %s%n", sb);
		
	}

	public static void main(String[] args) {

		new StringBuilderClass().show();

	}

}
