package doWhile;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Ejercicio6 {

    double grade, passedSum = 0, failedSum = 0;
    double passedAverage, failedAverage;
    int iteration = 0, passedCount = 0, failedCount = 0;
    Scanner scanner = new Scanner(System.in);

    public void calculate() {

        do {
            System.out.printf("Enter a grade: ");
            grade = scanner.nextDouble();

            if (grade >= 0 && grade <= 10) {
                iteration++;

                if (grade >= 5) {
                    passedSum += grade;
                    passedCount++;
                } else {
                    failedSum += grade;
                    failedCount++;
                }
            }

        } while (grade != -1);

        if (passedCount > 0) {
            passedAverage = passedSum / passedCount;
            System.out.printf("Passed students: %d%n", passedCount);
            System.out.printf("Average of passed grades: %.2f%n", passedAverage);
        } else {
            System.out.printf("There are no passed students.%n");
        }

        if (failedCount > 0) {
            failedAverage = failedSum / failedCount;
            System.out.printf("Failed students: %d%n", failedCount);
            System.out.printf("Average of failed grades: %.2f%n", failedAverage);
        } else {
            System.out.printf("There are no failed students.%n");
        }

        System.out.printf("Total valid grades: %d%n", iteration);
        scanner.close();
    }

    public void show() {
        calculate();
    }

    public static void main(String[] args) {
        new Ejercicio6().show();
    }
}