package com.logical.programing;
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        stopwatch();
    }
    public static void  stopwatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'start' to start the stopWatch");
        String srt = sc.next();
        long start = System.currentTimeMillis();
        System.out.println(start);
        if (srt.equals("start")) {
            System.out.println("Type 'stop' to stop the stopWatch");
            String stp = sc.next();
            while (!stp.equals("stop")) {
                System.out.println("Type 'stop' to stop the stopWatch");
                stp = sc.next();
            }
            long stop = System.currentTimeMillis();
            long time = stop - start;
            System.out.println("Elapsed Time in ms = " + time);
            System.out.println("Elapsed Time in sec = " + time / 1000);
        } else {
            System.out.println("Wrong Input");
        }
    }
}