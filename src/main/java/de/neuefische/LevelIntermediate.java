package de.neuefische;

import java.util.Scanner;

public class LevelIntermediate {

    static Scanner scanner = new Scanner(System.in);

    static String[] einsBisZehn = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};

    public static String printStringNumber(int input) {
        return einsBisZehn[input - 1];
    }

    public static void printWeirdNumbersWithModulo() {
        for (int counter = 1; counter < 101; counter++) {
            if (counter % 15 == 0) {
                System.out.println("#$" + String.valueOf(counter));
            }
            else if (counter % 3 == 0) {
                System.out.println("#" + String.valueOf(counter));
            }
            else if (counter % 5 == 0) {
                System.out.println("$" + String.valueOf(counter));
            }
            else System.out.println(String.valueOf(counter));
        }
    }

    public static void fillStringArrayWithScanner() {

        System.out.println("Wie viele Wörter möchtest du speichern?:");
        String[] stringArr = new String[scanner.nextInt()];
        for (int i = 0; i < stringArr.length; i++){
            System.out.println("Dein Wort bitte:");
            String input = scanner.next();
            stringArr[i] = input;
        }

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }


    }
}
