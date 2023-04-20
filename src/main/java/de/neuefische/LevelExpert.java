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

    public static String convertToRome(int num) {
        char romeChar[] = {'I', 'V', 'X', 'L', 'C'};
        int tempInt;
        String rome = "", tempString = "";
        if (num > 100){
            rome = "Ich kann nur bis 100";
            return rome;
        }
        for (int i = 0; num > 0; i += 2){
            tempInt = num % 10;
            if (tempInt == 4) {
                tempString += romeChar[i];
                tempString += romeChar[i + 1];
            } else if (tempInt == 9) {
                tempString += romeChar[i];
                tempString += romeChar[i + 2];
            } else {
                if (tempInt >= 5) {
                    tempString += romeChar[i + 1];
                    tempInt -= 5;
                }
                for (; tempInt > 0; tempInt--) {
                    tempString += romeChar[i];
                }
            }
            num /= 10;
            rome = tempString + rome;
        }
        return rome;
    }
}
