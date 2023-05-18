package org.example.les3;

public class Switch {
    public static void main(String[] args) {

        int x = 30;
        switch (x) {
            case 27:
                System.out.println("case 1 27");
                break;
            case 30:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("------");  // java 17 уже break встроено
        switch (x) {
            case 27 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 33 -> System.out.println("3");
            case 44 -> System.out.println("4");
            default -> System.out.println("default");
        }
        System.out.println("=====THE BIGGEST NUM======");
        int x1 = 3;
        int y1 = 5;
        int z1 = 8;
        int max = (x1 > y1) ? ((x1 > z1) ? x1 : z1) : ((y1 > z1) ? y1 : z1);
        System.out.println("max = " + max);


    }
}
