package org.example.les4;

public class ReturnExample {
    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i < max; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("i = " + i);
        }
        System.out.println("After the loop");
    }
}
