package org.example.les1;
import java.util.Scanner;
// Подключаем сканер, чтобы читать аргументы пользователя, которые он вводит в консоль

    public class kto {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String encoding = System.getProperty("console.encoding", "utf-8");
            // создаём сканер c именем "in"
            System.out.println("Kto tam ");
            String ktoto = in.nextLine();
            // определяем переменную "ktoto" с типом "строка"
            // и читаем из консоли то что ввёл пользователь до конца строки
            if (ktoto.equals("Kozlyatki") || ktoto.equals("kozlyatki"))
                // условие, если введённая пользователем строка совпадает с 1 из 2 вариантов
                // то выводим одно сообщение
                System.out.println("You are not kozlyatki. You sound like sutulaya sobaka");
            else
                // ... и если не совпадает, выводим другое сообщение
                System.out.println("Привет, " + ktoto + ". Ты написал вторую свою программу");
        }
    }
