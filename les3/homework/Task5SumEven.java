package org.example.les3.homework;

/*
Task 5
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class Task5SumEven {
    public static void main(String[] args) {
        int sumEven = 0;

        for (int i = 2; i <= 100; i += 2) {
            sumEven = sumEven + i;
        }
        System.out.println("Sum of even from 2 to 100 is " + sumEven);
    }
}
