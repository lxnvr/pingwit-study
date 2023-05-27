package org.example.les4.homework;

import java.util.Scanner;

public class Task5EndlessWay {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        short minTime = 2;
        short maxTime = 30;
        short duration = getInput(time, "Enter time in seconds, recommended is 2-30");
        validate(duration, minTime, maxTime);
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        long timeLimit = startTime + duration * 1000;
        drawPattern(timeLimit);
        calcRuntime(startNanoTime);
    }

    static short getInput(Scanner time, String msg) {
        System.out.println(msg);
        return (short) time.nextInt();
    }

    static void validate(short input, short min, short max) {
        if (input < min | input > max) {
            System.out.println("Incorrect input, try another time");
        } else {
            System.out.println("Drawing highway to hell for " + input + " seconds:");
        }
    }

    static void drawPattern(long finish) {
        short wayPivotPoint = 8;
        long now = System.currentTimeMillis();
        System.out.println(now);
        while (now < finish) {
            now = System.currentTimeMillis();
            for (short way = 1; way <= wayPivotPoint; way++) {
                for (short line = 1; line <= way; line++) {
                    System.out.print(" ");
                }
                System.out.println("\\\\" + "    \\    "+"\\\\");
            }
            for (short way = wayPivotPoint; way >= 1; way--) {
                for (short line = 1; line <= way; line++) {
                    System.out.print(" ");
                }
                System.out.println("//    /     //");
            }
        }
    }

    static void calcRuntime(long initTime){

        double measuredRuntime = System.nanoTime() - initTime;
        System.out.println(measuredRuntime / 10e8 + " second elapsed");
    }
}
