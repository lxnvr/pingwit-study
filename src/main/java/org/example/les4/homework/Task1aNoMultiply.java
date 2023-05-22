package org.example.les4.homework;

import java.util.Scanner;

public class Task1aNoMultiply {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        double a = getNumsFromConsole(numbers, "Enter first number");
        double b = getNumsFromConsole(numbers, "Enter second number");
        double result = getMult(a, b);
        printMult(result);
    }

    public static double getNumsFromConsole (Scanner numbers, String msg) {
        System.out.println(msg);
        return numbers.nextDouble();
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
        if (a % 1 == 0 && b % 1 == 0) {  // лучше так double и float не сравнивать, но здесь сойдёт
            int i = 1;
            while (i < b) {
                mult += a;
                i++;
            }
            result = (isNegative) ? -mult : mult;
        } else {
            result = a / (1 / b);

        }
        return result;
    }
}
