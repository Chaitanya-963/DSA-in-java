// Question: To calculate Fibonacci Series up to n numbers.

package com.JavaBasic;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();

        int t1 = 0 , t2 = 1;

        for (int i = 1;i<=num;i++){
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }


    }
}
