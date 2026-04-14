// Question: Write a program to print whether a number is even or odd, also take input from the user.

package com.JavaBasic;

import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number to know it's even or odd: ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }

        in.close();
    }
}
