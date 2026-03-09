package Basics;

import java.util.Scanner;

public class OperatorClass {
    public static void main(String[] args) {

        // Arithmetic Operators
//        int x = 10;
//        int y = 3;
//        int z;

//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
//        z = x % y;
//        System.out.println(z);

        // Augmented Assignment Operators

//        int x = 10;
//        int y = 5;
//
//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//
//        System.out.println(x);


        // Increment and Decrement Operators

//        int x = 1;
//        int y = 3;

//        x++;
//        x--;

//        System.out.println(x);

        // ORDER OF OPERATORS [P-E-M-D-A-S]

//        double result = 3 + 4 * (7 - 5) / 2.0;
//
//        System.out.println(result);


        // Logical Operator

//        && = AND
//        || = OR
//        ! = NOT
//        double temp = -10;
//        boolean isSunny = false;
//
//        if (temp <= 30 && temp >= 0 && isSunny) {
//            System.out.println("The weather is GOOD 😎😎");
//            System.out.println("It is sunny outside☀️");
//        } else if (temp <= 30 && temp >= 0 && !isSunny) {
//            System.out.println("The weather is GOOD 😎😎");
//            System.out.println("It is cloudy outside☀🌧️");
//        } else if (temp >= 30 || temp < 0) {
//            System.out.println("The weather is bad 🙁");
//        }
//

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces and underscores");
        } else {
            System.out.printf("Welcome %s to platform", username);
        }


        scanner.close();
    }
}
