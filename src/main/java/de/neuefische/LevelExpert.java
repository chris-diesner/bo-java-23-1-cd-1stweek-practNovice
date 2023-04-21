package de.neuefische;

import java.util.Arrays;
import java.util.Scanner;

public class LevelExpert {
    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe bitte:");
        String input = scanner.next();


        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    public static void arraySort() {
        int[] number = {6,2,8,3,9,6};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }

    public static String splitString(String input){
        String[] words = input.split(",");
        return words[0];
    }


    public static int convertInChecksum(int num) {
        int checkSum = 0;
        while (0 != num) {
            checkSum = checkSum + (num % 10);
            num = num / 10;
        }
        return checkSum;
    }

    private static int[] decValues = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] romeChar = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertToRome(int number) {

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < decValues.length; i++) {
            while (number >= decValues[i]) {
                number -= decValues[i];
                s.append(romeChar[i]);
            }
        }
        return s.toString();
    }
}
