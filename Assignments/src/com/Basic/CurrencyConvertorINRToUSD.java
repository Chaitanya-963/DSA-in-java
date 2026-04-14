// Question : Input currency in rupees and output in USD.

package com.JavaBasic;

import java.util.Scanner;

public class CurrencyConvertorINRToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double INR_TO_USD_RATE = 0.01083;


        System.out.print("Enter your amount (in INR) to see USD value: ");
        double amount = in.nextDouble();

        double USDAmount = amount * INR_TO_USD_RATE;

        System.out.printf("Value of ₹%.2f in USD: $%,.2f%n", amount, USDAmount);
        in.close();
    }
}
