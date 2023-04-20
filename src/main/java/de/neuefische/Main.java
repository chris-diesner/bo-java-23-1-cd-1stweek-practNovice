package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(printMyName());
        printMyNameInLoop();
        welcomeOutput();

    }

    public static String printMyName() {
        return "Christian Diesner";
    }

    public static void printMyNameInLoop() {
        for (int i = 1; i < 6; i++) {
            System.out.println(printMyName());
        }
    }

    public static boolean isBiggerZero(int num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public static void welcomeOutput() {
        System.out.println("Wer bist'n Du?:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Tach, " + name + "! Schön, dass Du da bist!");
    }
}