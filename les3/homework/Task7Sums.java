package org.example.les3.homework;

/*
Task 7
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class Task7Sums {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumUnEven = 0;
        int sumAll = 0;
        for (int i = 0; i <= 100; i++) {
            sumAll = sumAll + i;
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumUnEven = sumUnEven + i;
            }
        }
        System.out.println("Sum of even from 0 to 100 is " + sumEven);
        System.out.println("Sum of uneven from 0 to 100 is " + sumUnEven);
        System.out.println("Total sum from 0 to 100 is " + sumAll);
    }
}
