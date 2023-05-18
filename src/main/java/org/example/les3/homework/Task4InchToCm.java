package org.example.les3.homework;

/*
Task 4
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
//+
public class Task4InchToCm {
    public static void main(String[] args) {
        float cm = 2.54f;
        //20 - magic number. Его можно вынести в переменную
        for (int inch = 1; inch <= 20; inch++) {
            Float inch2cm = inch * cm;
            String inchVal = String.format("|  %02d in  |", inch);
            String result = String.format(" %05.2f cm |", inch2cm);
            System.out.println(inchVal + result);
        }
    }
}
