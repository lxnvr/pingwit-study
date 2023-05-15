package org.example.les3.homework;

import java.io.FilterOutputStream;

/*
Task 3
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task3NoMultiply {
    public static void main(String[] args) {
        int a = 5;
        int b = -7;
        int mult = 0;
        boolean isNegative = false;

        System.out.print(a + " x " + b + " with no multiplication in integer numbers is ");

        if (b < 0) {
            b = -b;
            isNegative = true;
        }
        for (int i = 0; i < b; i++) {
            mult += a;
        }

        Integer result = (isNegative) ? -mult : mult;

        System.out.println(result.intValue());

        float a1 = -3.1428f;
        float b1 = 10;
        float c1 = a1 / (1 / b1);
        System.out.print(a1 + " x " + b1 + " with no multiplication in floating numbers is ");
        System.out.println(c1);
    }

}
