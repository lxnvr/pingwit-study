package org.example.les4;

public class ContinueExample {
    public static void main(String[] args) {
        // пропустить текущую итерацию
        for (int i =0; i <=10; i++) {
            if (i ==5 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
