package org.example.les4.homework;

import java.util.Scanner;

/*
Task 4
Даны числа от 0 до 100 (числа пользователя)
 - Посчитать сумму четных и вывести на экран
 - Посчитать сумму нечетных и вывести на экран
 - Найти общую сумму всех чисел
 */
public class Task4Sums {
    public static void main(String[] args) {
        Scanner ints = new Scanner(System.in);
        int firstNum = getInput(ints, "Enter first integer number:");
        int lastNum = getInput(ints, "Enter second integer number:");
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

    static void printRow(int firstNum, int lastNum) {
        System.out.print("Sorted row is: ");
        int sumOfEvenNumbers = 0, sumOfOddNumbers = 0, totalSum;
        int number = firstNum;
        while (number <= lastNum) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                sumOfOddNumbers += number;
            }
            System.out.print(number + " ");
            number++;

        }
        totalSum = sumOfEvenNumbers + sumOfOddNumbers;
        System.out.print("\nSum of even numbers: " + sumOfEvenNumbers);
        System.out.print("\nSum of odd numbers: " + sumOfOddNumbers);
        System.out.println("\nTotal sum is " + totalSum);
    }
}
