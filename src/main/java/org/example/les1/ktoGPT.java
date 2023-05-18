package org.example.les1;

import java.util.Scanner;
// Подключаем сканер, чтобы читать аргументы пользователя, которые он вводит в консоль

public class ktoGPT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean restart = true;
        do {
            System.out.println("Who are you?");
            String ktoto = in.nextLine();
            if (ktoto.equalsIgnoreCase("kozlyatki") || (ktoto.equalsIgnoreCase("Kozlyatki"))) {
                System.out.println("You are not kozlyatki. You sound like sutulaya sobaka!");
            } else {
                System.out.println("Chto znachit " + ktoto + "?. Vy kto takie? Ya vas ne zval. Idite nafig");
                restart = false;
            }
        } while (restart);
    }
}

/* Модификация предыдущей программы Kto
попросил ChatGPT дописать код так, чтобы он переспрашивал если пользователь введёт определённый ответ.
 */