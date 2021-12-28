package com.logical.programing;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSeries();
    }

    public static void printFibonacciSeries() {
        int number, sum, firstNumber = 0, secondNumber = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number up to which you need fibonacci series : ");
        number = sc.nextInt();
        System.out.print("Fibonacci series is : ");
        for (int i=1; i<=number; i++) {
            System.out.print(" " +firstNumber);
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }
}
