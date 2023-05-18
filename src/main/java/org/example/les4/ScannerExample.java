package org.example.src.main.java.org.example.les4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.next();

        System.out.println("how old are you");

        byte age = scanner.nextByte();

        System.out.println("name " + name);
        System.out.println("age " + age);
    }
}
