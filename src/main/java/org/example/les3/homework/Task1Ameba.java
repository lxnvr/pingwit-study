package org.example.les3.homework;

/*
Task 1
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Task1Ameba {
    public static void main(String[] args) {
        int amebaCount = 1;
        for (int hour = 3; hour <= 24; hour += 3) {
            System.out.print("in " + hour + " hours we have ameba amount of ");
            System.out.println(amebaCount *= 2);//лучше в отдельну/ переменную
        }
        System.out.println("Gretta is happy...");
    }
}
