package es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class FirstExercise {

    public static Logger log = LoggerFactory.getLogger(FirstExercise.class);
    public static void print5numbers() {

        Scanner scanner = new Scanner(System.in);
        int[] arrayOf5numbers = new int[5];
        for (int i = 0; i < arrayOf5numbers.length; i++) {
            arrayOf5numbers[i] = (int) Math.floor(Math.random() * 10 + 1);
        }
        int number;
        do {
            System.out.println(Arrays.toString(arrayOf5numbers));
            System.out.println("Inserisci un numero da inserire nell'array. Se inserisci 0 il programma si chiuderà.");
            number = scanner.nextInt();
            System.out.println("Inserisci un numero per specificare in quale posizione dell'array vuoi inserirlo");
            int position = scanner.nextInt();
            try {
                arrayOf5numbers[position] = number;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore, l'array può contenere al massimo 5 elementi.");
                System.err.println("Errore " + e.getMessage());
                log.error("Error");

            } finally {
                System.out.println(Arrays.toString(arrayOf5numbers));

            }
        } while(number != 0);
        scanner.close();

    }

    public static void main(String[] args) {
        print5numbers();
    }
}