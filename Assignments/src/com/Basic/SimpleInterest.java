// Question: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest and Total Amount.
package com.JavaBasic;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your principle amount: ");
        double principle = in.nextDouble();
        System.out.print("Enter your time period (in years): ");
        float time = in.nextFloat();
        System.out.print("Enter your rate of interest: ");
        float rate = in.nextFloat();

        double SI = (principle * time * rate) / 100;
        double TotalAmount = principle + SI;
        System.out.println("The simple interest of " + principle + " for " + time + " years at " + rate + "% is: " + SI);

        System.out.printf("Total Amount owed: %.2f", TotalAmount);


        in.close();
    }
}
