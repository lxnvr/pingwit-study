package org.example.les3;

public class LogicalOperators {
    public static void main(String[] args) {
        //& - AND - проверяет все переменные , && - AND проверяет тилько 1 на false
        // | - OR
        boolean a = true;
        boolean b = false;
        boolean c = a & b;


        // | OR,  || - OR хотя бы 1 true
        System.out.println(c);
        System.out.println(true | false);

        // ! - NOT
        boolean d = !(a && b);


    }
}
