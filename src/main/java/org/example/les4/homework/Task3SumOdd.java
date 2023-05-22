package org.example.les4.homework;

import java.util.Scanner;

/*
Task 3
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99 (1, 99 - числа пользователя)
 */
public class Task3SumOdd {

    public static void main(String[] args) {
        Scanner ints = new Scanner(System.in);
        int firstNum = getInput(ints, "Enter first integer number");
        int lastNum = getInput(ints, "Enter second integer number");
        sort(firstNum, lastNum);
    }

    static int getInput(Scanner ints, String msg) {
        System.out.println(msg);
        return ints.nextInt();
    }

    static void sort(int first, int last) {
        if (first < last) {
            printRow(first, last);
        } else {
            printRow(last, first);
        }
    }

    static int defineOdd(int value) {
        if (value % 2 == 0) {
            value += 1;
        }
        return value;
    }

    static void printRow(int firstOdd, int lastOdd) {
        firstOdd = defineOdd(firstOdd);
        int sum = 0;
        System.out.print("Calculating sorted row: ");
        do {
            System.out.print(firstOdd + " + ");
            sum += firstOdd;
            firstOdd += 2;
            }
        while (firstOdd <= lastOdd);
        System.out.print("= " + sum);
    }
}
