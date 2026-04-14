// Question: Take 2 numbers as input and print the largest number.


package com.JavaBasic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }

        in.close();
    }
}
