package com.logical.programing;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class distinctCoupons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of coupon you wish to generate : ");
        int numberOfCoupons = sc.nextInt();
        couponGenerator(numberOfCoupons);
    }

    public static void couponGenerator(int range) {
        ArrayList<Integer> coupons = new ArrayList<>(range);
        int count = 0;
        int reqiredRange = range * 10;
        int totalRandomNumber = 0;
        while (count != range) {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, reqiredRange);
            totalRandomNumber++;
            if (!coupons.contains(randomNumber)) {
                coupons.add(randomNumber);
                count++;
            }
        }
        for (int i = 0; i < range; i++) {
            System.out.println(coupons.get(i));
        }
        System.out.println(totalRandomNumber +" times random number generated");
    }
}
