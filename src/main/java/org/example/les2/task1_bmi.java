package org.example.les2;

import java.util.Scanner;

//названия классов с большой буквы в camel case и без нижних подчеркиваний, а так все хорошо - +
public class task1_bmi {
    public static void main(String[] args) {
        // в примере применены преобразования примитивов и математические действия с ними
        /*
        Индекс массы тела (ИМТ) — это числовое значение, используемое для оценки соотношения массы тела и роста человека.
         Формула для расчета ИМТ:
        ИМТ = масса тела (в килограммах) / квадрат роста (в метрах)
         */
        Scanner hParams = new Scanner(System.in);                       // да, я знаю мы это не проходили, ну и что.
        char n = '\n';
        System.out.println("Enter your age");                           // ввод первого числа тип байт
        byte age = hParams.nextByte();
        System.out.println("Enter your height, in cm:");
        int height = hParams.nextInt();                                 // здесь int, т.к. байта мало
        System.out.println("Enter your weight in kg:");
        int weight = hParams.nextInt();                                 // здесь тоже int
        float fWeight = weight;                                         // смена примитива
        float fHeight = height;
        System.out.println("Your age is " + age);                       // повторение урока 1
        System.out.println("Your height is " + fHeight / 100 + "m");
        System.out.println("Your weight is " + fWeight + "kg");
        float bmi = (fWeight / ((fHeight / 100) * (fHeight / 100)));    // вычмсления и т.к. результат скорее всего дробный, то переводим во float
        int ibmi = (int) bmi;

        if (bmi <= 18.5 || (bmi >= 25)) {                              // сравнимваем полученное значение с нормами и выводим сообщение
            System.out.println("Your body mass index is " + bmi);
            System.out.println(n + "To be easy, it's " + ibmi + ". At your age of " + age + " years, you still have time for changes. But who cares.");
        } else {
            System.out.println("Your body mass index is " + bmi);
            System.out.println(n + "To be easy, it's " + ibmi + ". It's normal, so keep going.");
        }
    }
}
