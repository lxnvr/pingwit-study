package org.example.les4.homework;

import java.util.Scanner;

public class Task1aNoMultiply {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = numbers.nextDouble();
        System.out.println("Enter second number:");
        double b = numbers.nextDouble();
        double result = getMult(a, b);
        printMult(result);
    }

    public static void printMult(double result) {
        if (result % 1 == 0) {
            System.out.print("The result with no multiplication in integer numbers is ");
            System.out.println(result);
        } else {
            System.out.print("The result with no multiplication in floating numbers is ");
            System.out.println(result);
        }
    }

    public static double getMult(double a, double b) {
        double mult = 0d;
        double result;
        boolean isNegative = false;
        if (b < 0) {
            b = -b;
            isNegative = true;
        }
        if (a % 1 == 0 && b % 1 == 0) {
            for (int i = 0; i < b; i++) {
                mult += a;
            }
            result = (isNegative) ? -mult : mult;
        } else {
            result = a / (1 / b);

        }
        return result;
    }
}
