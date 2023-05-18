package org.example;

import java.sql.SQLOutput;

public class Drafts {
    public static void main(String[] args) {
        int num111 = 0x6F; // 16-теричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13

        System.out.println(num111);
        System.out.println(num8);
        System.out.println(num13);

        int x = 123_456;
        int y = 234_567__789;
        System.out.println(x);  // 123456
        System.out.println(y);  // 234567789

        int x1=5;
        float y1=6;
        System.out.printf("x=%d; y=%.2f \n", x1, y1);


        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[5];
        System.out.println(nums);


            int i,sum;
            for(i = 1 , sum = 0; i <= 5; ++i)
            {
                //loop body has multiple statements.
                System.out.println("The value of i is: "+i) ;
                sum = sum + i;
            }
            System.out.println("The sum of the first 5 numbers is: " +sum) ;

    }

    }

