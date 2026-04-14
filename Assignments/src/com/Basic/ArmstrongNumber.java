// Question : To find Armstrong Number between two given number.

package com.JavaBasic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter start number: ");
        long start = in.nextLong();

        System.out.print("Enter end number: ");
        long end = in.nextLong();

        System.out.println("Armstrong number between " + start + " and " + end + ":");

        for (long i = start; i <= end; i++) {
            long num = i;
            long sum = 0;
            long digits = 0;

            long temp = num;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = num;
            while (temp > 0) {
                long lastDigit = temp % 10;

                long power = 1;
                for (long j = 0; j < digits; j++) {
                    power *= lastDigit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == i && i != 0) {
                System.out.print(i + " ");
            }
        }

        in.close();

    }
}
