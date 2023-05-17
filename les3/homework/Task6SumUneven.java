package org.example.les3.homework;

/*
Task 5
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
//+
public class Task6SumUneven {
    public static void main(String[] args) {
        int sumEven = 0;

        for (int i = 1; i <= 99; i += 2) {
            sumEven = sumEven + i;
        }
        System.out.println("Sum of uneven from 1 to 99 is " + sumEven);
    }
}
