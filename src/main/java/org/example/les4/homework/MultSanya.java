package org.example.les4.homework;

import java.util.Scanner;

 /* by Alexander Kazlou */

public class MultSanya {
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = enterIntegerNumber(scanner, "Enter first integer number:");
        int b = enterIntegerNumber(scanner, "Enter second integer number:");

        long product = multiply(a, b);
        System.out.println("a * b = " + product);

        System.out.println("number of '+' operations: " + counter);
    }

    static int enterIntegerNumber(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    static long multiply(int a, int b) {
        int absoluteValueA = getAbsoluteValue(a);
        int absoluteValueB = getAbsoluteValue(b);

        long product;
        if (absoluteValueA < absoluteValueB) {
            product = multiplyPositiveNumbers(absoluteValueB, absoluteValueA);
        } else {
            product = multiplyPositiveNumbers(absoluteValueA, absoluteValueB);
        }

        if (isMultiplicationNegative(a, b)) {
            return -product;
        }
        return product;
    }

    static int getAbsoluteValue(int value) {
        return (value < 0) ? -value : value;
    }

    static boolean isMultiplicationNegative(int a, int b) {
        return (a < 0 ^ b < 0);
    }

    /**
     * Multiplies positive integer numbers. Efficiency depends on the order.
     *
     * @param max - the first number
     * @param min - the second number
     * @return product of provided numbers
     */
    static long multiplyPositiveNumbers(int max, int min) {
        long product = 0;
        long x = max;

        for (int i = 1; i <= min; i <<= 1) {
            if ((min & i) != 0) {
                product += x;
                counter++;
            }
            x += x;
            counter++;
        }
        return product;
    }
}
