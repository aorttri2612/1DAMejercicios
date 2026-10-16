package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio2 {

    int num1;
    int num2;
    int num3;

    public String comprobarIguales(int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            return String.format("Hay tres números iguales a %d", num1);
        } else if (num1 == num2) {
            return String.format("Hay dos números iguales a %d", num1);
        } else if (num1 == num3) {
            return String.format("Hay dos números iguales a %d", num1);
        } else if (num2 == num3) {
            return String.format("Hay dos números iguales a %d", num2);
        } else {
            return "No hay números iguales";
        }
    }
    
    @SuppressWarnings("resource")
    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.printf("Introduce el segundo número: ");
        num2 = sc.nextInt();

        System.out.printf("Introduce el tercer número: ");
        num3 = sc.nextInt();

        System.out.printf("%s%n", comprobarIguales(num1, num2, num3));
    }

    public static void main(String[] args) {
        new Ejercicio2().show();
    }
}