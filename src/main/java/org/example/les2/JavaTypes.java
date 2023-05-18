package org.example.les2;

public class JavaTypes {
    public static void main(String[] args) {
        //1й способ
        byte myByte = 2;

        // 2й способ
        byte myByte2; // по умолчанию 0
        myByte2 = 44;

        byte myByte3 = 127;
        System.out.println(myByte3);

        short myShort = 33;
        System.out.println(myShort);

        int myInt = 234352525;
        long myLong = 2343445434352L;
        System.out.println(myLong);

        float myFloat = 2.15f;
        float myFloat2 = 100;
        System.out.println(myFloat2);

        double myDouble = 55.88;
        double myDouble2 = 300;
        System.out.println(myDouble2);

        boolean myBoo;
        myBoo = false;
        System.out.println(myBoo);

        char myChar = 'k';
        System.out.println(myChar);

        char myChar2 = 33; // код символа Юникод
        System.out.println(myChar2);

        char myCharUTF = '\n';

        char myCharNum = 33;

        System.out.println(myCharUTF);
        System.out.println(myCharNum);
    }
}
