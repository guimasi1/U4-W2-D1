package es2;

import java.util.Scanner;

public class SecondExercise {
    public static void CalcFuelConsumption() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Inserire il numero di km.");
            int km = scanner.nextInt();
            System.out.println("Inserire i litri consumati.");
            int liters = scanner.nextInt();
            int consumption = km / liters;
            System.out.println("This is the fuel consumption: " + consumption + "km/l");
        } catch (ArithmeticException e) {
            System.err.println("Error. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CalcFuelConsumption();
    }
}
