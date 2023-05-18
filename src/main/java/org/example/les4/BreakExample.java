package org.example.src.main.java.org.example.les4;

public class BreakExample {
    // остановка по достижению
    public static void main(String[] args) {
        for (int i =0; i <=10; i++) {
            if (i == 5 ) {
                break;
            }
            System.out.println(i);
        }
    }
}
