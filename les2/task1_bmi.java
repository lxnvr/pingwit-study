package org.example.les2;

import java.util.Scanner;

public class task1_bmi {
    public static void main(String[] args) {
        // в примере применены преобразования примитивов и математические действия с ними
        /*
        Индекс массы тела (ИМТ) — это числовое значение, используемое для оценки соотношения массы тела и роста человека.
         Формула для расчета ИМТ:
        ИМТ = масса тела (в килограммах) / квадрат роста (в метрах)
         */
        Scanner hParams = new Scanner(System.in);
        char n = '\n';
        System.out.println("Enter your age");
        byte age = hParams.nextByte();
        System.out.println("Enter your height, in cm:");
        int height = hParams.nextInt();
        System.out.println("Enter your weight in kg:");
        int weight = hParams.nextInt();
        float fWeight = weight;
        float fHeight = height;
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + fHeight / 100 + "m");
        System.out.println("Your weight is " + fWeight + "kg");
        float bmi = (fWeight / ((fHeight / 100) * (fHeight / 100)));
        int ibmi = (int) bmi;

        if (bmi <= 18.5 || (bmi >= 25)) {
            System.out.println("Your body mass index is " + bmi);
            System.out.println(n + "To be easy, it's " + ibmi + ". At your age of " + age + " years, you still have time for changes. But who cares.");
        } else {
            System.out.println("Your body mass index is " + bmi);
            System.out.println(n + "To be easy, it's " + ibmi + ". It's normal, so keep going.");
        }
    }
}
