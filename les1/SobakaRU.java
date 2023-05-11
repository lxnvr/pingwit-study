package org.example.les1;

public class SobakaRU {
        public static void main (String[] args) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        System.out.println("Привет, " + args[0] + ". Ты собака сутулая!");
        }
}

// еще способ  javac -encoding utf-8 для вывода русских букв