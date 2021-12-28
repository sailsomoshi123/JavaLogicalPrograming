package com.logical.programing;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        checkPerfectNumberOrNot();
    }

    public static void checkPerfectNumberOrNot() {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check perfect number or not : ");
        number = sc.nextInt();
        for (int i = 1; i < number; i++)
            if (number % i == 0) {
                sum = sum + i;
            }
        if (sum == number) {
            System.out.println(number +" number is perfect number.");
        }
        else {
            System.out.println(number +" number is not a perfect number.");
        }
    }
}
