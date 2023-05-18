package org.example.les2;

public class JavaOps {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;

        int sum = num1 + num2;
        num1 += num2;
        int sub = num1 - num2;
        System.out.println("Addition = " + sum);
        System.out.println("Substraction = " + sub);

        int num3 = 33;
        int div = num1 / num3;
        System.out.println("division = " + div);

        float divFloat = num1 / num3;  // поделил int на int и вывел только целую часть
        System.out.println("Float Division =" + divFloat);

        float fl1 = 22.45f;
        float fl2 = 11.16f;
        System.out.println(fl1 / fl2);


        int myint = 100;
        myint += 10;
        System.out.println("myInt = " + myint);
        System.out.println("myInt++ =" + myint++); // внутри уже 111, а на консоли 110
        System.out.println("myInt++ =" + ++myint); // 112, потому что вначале складываем, а потом выводим

        boolean myBool = 2 == 4;
        System.out.println(myBool);
        boolean myBool2 = 5 > 4;
        System.out.println(myBool2);
        /*
            3 ->  1 1
            3 << 2  -> 1 1 0 0 -> 12

            8 -> 1 0 0 0
            8 >> 2 -> 1 0 -> 2
         */


        int myInt22 = 3 << 2;
        System.out.println(myInt22);

        int myInt23 = 8 >> 2;
        System.out.println(myInt23);

    }
}
