// Question: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.JavaBasic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double answer = 0;

        System.out.print("Enter the two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        System.out.print("Enter the operator (+, -, * ,/ , %): ");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            answer = num1 + num2;
        } else if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '*') {
            answer = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                answer = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero!");
                return;
            }
        } else if (operator == '%') {
            answer = num1 % num2;
        } else {
            System.out.println("Invalid operator!");
            return;
        }


        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);

        in.close();
    }
}
