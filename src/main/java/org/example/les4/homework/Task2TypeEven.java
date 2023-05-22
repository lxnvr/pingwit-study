package org.example.les4.homework;

import java.util.Scanner;

/*
Task 2
Напишите программу вывода всех четных чисел от 2 до 100 включительно (2, 100 - числа пользователя)
+ расширенно: пользователь может ввести любые целые числа в любом порядке, в т.ч. отрицательные
 */
public class Task2TypeEven {

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

    static int defineEven (int value) {
        if (value % 2 != 0) {
            value += 1;
        }
        return value;
    }

    static void printRow(int firstEven, int lastEven) {
        firstEven = defineEven(firstEven);
        int counter = 0;
        System.out.println("Sorted row of even numbers in range is: ");
        while (firstEven <= lastEven) {
            System.out.print(firstEven + ", ");
            firstEven += 2;
            counter +=1;
        }
        System.out.print(" total: " + counter);
    }
}
