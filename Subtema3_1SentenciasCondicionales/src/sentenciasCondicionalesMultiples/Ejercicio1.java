package sentenciasCondicionalesMultiples;
import java.util.Scanner;

public class Ejercicio1 {
	
	public void show() {
	
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

	        System.out.printf("Introduce una nota (0-10): ");
	        int grade = sc.nextInt();

	        switch (grade) {
	            case 0, 1, 2 -> System.out.printf("Muy deficiente%n");
	            case 3, 4 -> System.out.printf("Insuficiente%n");
	            case 5 -> System.out.printf("Suficiente%n");
	            case 6 -> System.out.printf("Bien%n");
	            case 7, 8 -> System.out.printf("Notable%n");
	            case 9, 10 -> System.out.printf("Sobresaliente%n");
	            default -> System.out.printf("Nota no válida.%n");
	        }
  
            }

    public static void main(String[] args) {
        new Ejercicio1().show();
    }
}