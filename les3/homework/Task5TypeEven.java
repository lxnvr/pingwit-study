package org.example.les3.homework;

/*
Task 5
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class Task5TypeEven {
    public static void main(String[] args) {
        System.out.print("Even row is ");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + ", ");//а может уберем запятую после последнего числа?:)
        }

// да ваще легко
        System.out.print("Fixed Even row is ");
        for (int i = 2; i <= 100; i += 2) {
            switch (i) {
                case 100:
                    System.out.print(i + ".");
                    break;
                default:
                    System.out.print(i + ", ");

            }
        }
    }
    }