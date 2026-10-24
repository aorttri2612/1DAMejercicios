package sentenciasCondicionalesMultiples;
import java.util.Scanner;


public class Ejercicio1 {
	int grade;
	
	public void gradesAnidation() {
		
		if( grade > 0 && grade <= 2) {
			System.out.println("f");	
		}else if(grade >= 3 && grade <= 4) {
			System.out.println("e");
		}else if(grade == 5) {
			System.out.println("d");
		}else if(grade == 6) {
			System.out.println("c");
		}else if(grade >= 7 && grade <=8) {
			System.out.println("b");
		}else if(grade >=9 && grade <=10) {
			System.out.println("a");
		} else if(grade < 0){
			System.out.println("no valid grade");
		}
		
	}
	public void show() {
	
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

	        System.out.printf("Introduce una nota (0-10): ");
	        grade = sc.nextInt();
	        gradesWithSwitch();
	}        
	public void gradesWithSwitch() {
	
	        switch (grade) {
	            case 0, 1, 2 -> System.out.println("Muy deficiente");
	            case 3, 4 -> System.out.println("Insuficiente");
	            case 5 -> System.out.println("Suficiente");
	            case 6 -> System.out.println("Bien");
	            case 7, 8 -> System.out.println("Notable");
	            case 9, 10 -> System.out.println("Sobresaliente");
	            default -> System.out.println("Nota no válida.");
	        }
  
            }

    public static void main(String[] args) {
        new Ejercicio1().show();
    }
}