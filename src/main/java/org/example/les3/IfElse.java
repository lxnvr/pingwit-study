package org.example.les3;

public class IfElse {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("hello");}
        else {
                System.out.println("else...");
            }

// жесть
        int number = 20;
        if (number % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("not even");
        }
       // тернарный оператор
       String result = number % 2 == 0 ? "Yes, Even" : "No, Not even";
        System.out.println(result);



    }
    }
