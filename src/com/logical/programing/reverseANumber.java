package com.logical.programing;
import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        numberReverse();

    }
    public static void numberReverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number you wish to reverse it : ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse*10+reminder;
            number=number/10;
        }
        System.out.println("Reverse of the number is : " +reverse);
    }
}
