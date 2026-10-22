package bucleFor;

import java.util.Scanner;

public class Ejercicio3 {

    @SuppressWarnings("resource")
    public void requestNumbers() {
    	 int n1, n2;
    	 Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter the first positive number: ");
            n1 = scanner.nextInt();

        } while (n1 <= 0);

        do {
            System.out.printf("Enter the second positive number: ");
            n2 = scanner.nextInt();

        } while (n2 <= 0);

        System.out.printf("%d x %d = %d%n", n1, n2, multiply(n1, n2));
        
    }

    public int multiply(int a, int b) {
    	int product, i;

        product = 0;

        for (i = 1; i <= b; i++) {
            product += a;
        }

        return product;
    }

    public void show() {
        requestNumbers();
    }

    public static void main(String[] args) {
        new Ejercicio3().show();
    }
}