package org.example.les3.homework;

/*
Task 2
Вычислить: 1+2+4+8+...+256
 */
//+
public class Task2Sum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum = sum + i;//sum += i as an option
        }
        System.out.println("1+2+4+...+256 = " + sum);
    }
}
