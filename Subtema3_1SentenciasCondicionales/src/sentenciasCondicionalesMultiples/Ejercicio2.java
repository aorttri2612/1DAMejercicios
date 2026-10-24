package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio2 {

    int num1;
    int num2;
    int num3;

    public String SearchEquals(int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            return String.format("The three numbers are the same %d", num1);
        } else if (num1 == num2) {
            return String.format("2 numbers equals %d", num1);
        } else if (num1 == num3) {
            return String.format("2 numbers equals %d", num1);
        } else if (num2 == num3) {
            return String.format("2 numbers equals %d", num2);
        } else {
            return "No hay números iguales";
        }
    }
    
    @SuppressWarnings("resource")
    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the first numbers: ");
        num1 = sc.nextInt();

        System.out.printf("Enter the second number: ");
        num2 = sc.nextInt();

        System.out.printf("Enter the third number: ");
        num3 = sc.nextInt();

        System.out.printf("%s%n", SearchEquals(num1, num2, num3));
    }

    public static void main(String[] args) {
        new Ejercicio2().show();
    }
}