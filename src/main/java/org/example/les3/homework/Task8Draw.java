package org.example.les3.homework;
import java.util.Scanner;

/*
Task 8
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *
 */

//+
public class Task8Draw {
    public static void main(String[] args) {
        Scanner dimension = new Scanner(System.in);
        System.out.println("Enter triangle side, recommended is 4-20");
        byte side = dimension.nextByte();
        char jewel = 9674;
        char upRT = 9699;
        char lowRT = 9700;
        if (side <= 20 & side >= 4) {
            System.out.println("=== Let's start drawing patterns ===");
            System.out.println("right upper triangle:");
            for (int i = 1; i <= side; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(upRT);
                }
                System.out.println(" ");
            }

            System.out.println("right lower triangle:");
            for (int i = side; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(lowRT);
                }
                System.out.println(" ");
            }
            System.out.println("shine bright like a diamond");

            for (int i = 1; i <= side; i++) {
                for (int j = side - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(jewel);
                }
                System.out.println();
            }

            for (int i = side-1; i >= 1; i--) {
                for (int j = side - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(jewel);
                }
                System.out.println();
            }

        } else {
            System.out.println("Value too low or too high");
        }
    }
}

