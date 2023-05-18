package org.example.les4;

import java.util.Scanner;

public class CustomMethods {
    public static void main(String[] args) {   // если что-то используется более 1 раза, то в отдельный метод
    int max = getMaxNumber();
       findSum(max);
    }

    static void findSum(int maxNum) {  // void ничего не возвращает
        int i = 0;
        int sum = 0;
        while (i <= maxNum) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    static int getMaxNumber () {  // метод возвращает int
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number:");
        int max = scan.nextInt();
        return max;
    }
}
